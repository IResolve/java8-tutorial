// a sample RSS feed 
var feed = 'http://feeds.bbci.co.uk/sport/0/rss.xml?edition=uk';

var url = new java.net.URL(feed);
input = new java.util.Scanner(url.openStream());
input.useDelimiter('$')
var contents = input.next()
contents
