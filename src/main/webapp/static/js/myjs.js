$.getJSON("welcome.jsp", function(data) {
  var tbody = $('.table tbody');
  tbody.empty();
  $.each(data, function(key, person) {
    tbody.append("<tr><td>" + person.feedback + "</td></tr>");
  });
});