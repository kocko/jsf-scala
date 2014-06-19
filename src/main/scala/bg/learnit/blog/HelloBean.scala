package bg.learnit.blog

import javax.faces.bean.ManagedBean
import javax.faces.bean.RequestScoped
import scala.reflect.BeanProperty

@RequestScoped
@ManagedBean(name = "helloBean")
class HelloBean {
  
  @BeanProperty
  var username: String = "kocko"
}