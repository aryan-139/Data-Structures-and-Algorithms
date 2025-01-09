select p.email 
from Person p
group by p.email 
HAVING count(*)>1

