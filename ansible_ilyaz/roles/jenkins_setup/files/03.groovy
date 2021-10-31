import java.util.logging.Level
import java.util.logging.Logger
import hudson.security.*
import jenkins.model.*

def instance = Jenkins.getInstance()

def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount("qwerty", "qwerty")

instance.setSecurityRealm(hudsonRealm)
instance.save()

}
