<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="url">${pageContext.request.contextPath}</c:set>
<link rel="stylesheet"
	href="${url}/tool/kindeditor/themes/default/default.css" />
<link rel="stylesheet"
	href="${url}/tool/kindeditor/plugins/code/prettify.css" />
<script charset="utf-8" src="${url}/tool/kindeditor/kindeditor.js">
</script>
<script charset="utf-8" src="${url}/tool/kindeditor/lang/zh_CN.js">
</script>
<script charset="utf-8"
	src="${url}/tool/kindeditor/plugins/code/prettify.js">
</script>
<script>
KindEditor.ready(function(K) {
	var editor1 = K.create('textarea[id="text"]', {
		cssPath : '${url}/tool/kindeditor/plugins/code/prettify.css',
		/* uploadJson : '${url}/tool/kindeditor/jsp/upload_json.jsp',
		fileManagerJson : '${url}/tool/kindeditor/jsp/file_manager_json.jsp', */
		allowFileManager : true,
		resizeType:0,
		afterCreate : function() {
			var self = this;
			K.ctrl(document, 13, function() {
				self.sync();
				document.forms['eform'].submit();
			});
			K.ctrl(self.edit.doc, 13, function() {
				self.sync();
				document.forms['eform'].submit();
			});
		}
	});
	prettyPrint();
});
</script>
