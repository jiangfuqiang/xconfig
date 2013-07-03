package org.xconfig.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xconfig.services.XconfigGrammarAccess;
import org.xconfig.xconfig.ConfigElement;
import org.xconfig.xconfig.ConfigElementType;
import org.xconfig.xconfig.Model;
import org.xconfig.xconfig.XconfigPackage;
import org.xconfig.xconfig.XmlConfig;

@SuppressWarnings("all")
public class XconfigSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XconfigGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XconfigPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XconfigPackage.CONFIG_ELEMENT:
				if(context == grammarAccess.getConfigElementRule()) {
					sequence_ConfigElement(context, (ConfigElement) semanticObject); 
					return; 
				}
				else break;
			case XconfigPackage.CONFIG_ELEMENT_TYPE:
				if(context == grammarAccess.getConfigElementTypeRule()) {
					sequence_ConfigElementType(context, (ConfigElementType) semanticObject); 
					return; 
				}
				else break;
			case XconfigPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case XconfigPackage.XML_CONFIG:
				if(context == grammarAccess.getXmlConfigRule()) {
					sequence_XmlConfig(context, (XmlConfig) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     type=STRING
	 */
	protected void sequence_ConfigElementType(EObject context, ConfigElementType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XconfigPackage.Literals.CONFIG_ELEMENT_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XconfigPackage.Literals.CONFIG_ELEMENT_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConfigElementTypeAccess().getTypeSTRINGTerminalRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ConfigElementType)
	 */
	protected void sequence_ConfigElement(EObject context, ConfigElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XconfigPackage.Literals.CONFIG_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XconfigPackage.Literals.CONFIG_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, XconfigPackage.Literals.CONFIG_ELEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XconfigPackage.Literals.CONFIG_ELEMENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConfigElementAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConfigElementAccess().getTypeConfigElementTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     xmls+=XmlConfig*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID configElements+=ConfigElement*)
	 */
	protected void sequence_XmlConfig(EObject context, XmlConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
