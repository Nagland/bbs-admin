$(function(){
	changeOrder.init();
});

var changeOrder = {
		init: function() {
			$('.mvtop').on('click',function(){
				var nowRow = $(this).parent().parent();
				var nowRowId = nowRow.attr('id');
				var nowRowNum = nowRow.prevAll().length;
				
				var id1 = nowRow.attr('id');
				var id2 = nowRow.prev().attr('id');
				
				if(nowRowNum != 0) {
					changeOrder.swapForum(id1,id2,nowRow,1);
				}
				
			});
			
			$('.mvdown').on('click', function(){
				var nowRow = $(this).parent().parent();
				var nowRowId = nowRow.attr('id');
				var nowRowNum = nowRow.prevAll().length;
				var intGridviewRowCount = $("table>tbody").children("tr").length;
				
				var id1 = nowRow.attr('id');
				var id2 = nowRow.next().attr('id');
				if(nowRowNum < intGridviewRowCount-1){
					changeOrder.swapForum(id1, id2, nowRow, 0);
				}
				
			});
		},
		
		
		swapForum: function(id1, id2,row,operate) {
			$.ajax({
				url: getRootPath() + '/adminajax/forum!swap.action',
				type: 'post',
				dataType: 'json',
				data: {
					id1: id1,
					id2: id2,
				},
				
				success: function(){
					if(operate == 1) {
						row.insertBefore(row.prev());			
					} else {
						row.insertAfter(row.next());
					}		
				}
				
			});
		},
		
		
		swapView: function(row, operate) {
			
			if(operate == 1) {
					row.insertBefore(row.prev());			
			} else {
					row.insertAfter(row.next());
				}	
			}
	
		
};

