package age.calculator.about;

import age.calculator.homepage.appController;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

public class AboutController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void okAction(ActionEvent event) {
        appController.aboutDialog.close();
    }

    @FXML
    private void mailAction(MouseEvent event) throws URISyntaxException, IOException {
        Desktop desktop;
        if (Desktop.isDesktopSupported()
                && (desktop = Desktop.getDesktop()).isSupported(Desktop.Action.MAIL)) {
            URI mailto = new URI("mailto:rajatdubey179@gmail.com?");
            desktop.mail(mailto);
        } else {
            // TODO fallback to some Runtime.exec(..) voodoo?
            throw new RuntimeException("desktop doesn't support mailto; mail is dead anyway ;)");
        }
    }

    @FXML
    private void githubAction(MouseEvent event) {
        try {
      //      Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/rajatdubey179"));
             Desktop.getDesktop().browse(new URI("https://github.com/rajatdubey179"));
            
        } catch (Exception e) {
            System.out.println("Error in URL");
        }
    }
     @FXML
    private void linkedInAction(MouseEvent event) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/rajatdubey179"));
           //  Desktop.getDesktop().browse(new URI("https://github.com/rajatdubey179"));
            
        } catch (Exception e) {
            System.out.println("Error in URL");
        }
    }
    @FXML
    private void youtubeInAction(MouseEvent event) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/channel/UC0UlyIzZXdMKMN5EB3emSZA/about"));
           //  Desktop.getDesktop().browse(new URI("https://github.com/rajatdubey179"));
            
        } catch (Exception e) {
            System.out.println("Error in URL");
        }
    }
    @FXML
    private void instagramInAction(MouseEvent event) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/rajatdubey_rd"));
           //  Desktop.getDesktop().browse(new URI("https://github.com/rajatdubey179"));
            
        } catch (Exception e) {
            System.out.println("Error in URL");
        }
    }
}

