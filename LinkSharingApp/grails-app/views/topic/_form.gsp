<%@ page import="com.ig.LinkSharingApp.Topic" %>



<div class="fieldcontain ${hasErrors(bean: topicInstance, field: 'topicName', 'error')} required">
	<label for="topicName">
		<g:message code="topic.topicName.label" default="Topic Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="topicName" required="" value="${topicInstance?.topicName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: topicInstance, field: 'createdBy', 'error')} required">
	<label for="createdBy">
		<g:message code="topic.createdBy.label" default="Created By" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="createdBy" name="createdBy.id" from="${com.ig.LinkSharingApp.User.list()}" optionKey="id" required="" value="${topicInstance?.createdBy?.id}" class="many-to-one"/>

</div>

