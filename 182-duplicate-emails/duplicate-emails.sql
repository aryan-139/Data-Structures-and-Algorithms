select p.email 
from Person p
group by p.email 
HAVING count(p.email)>1

