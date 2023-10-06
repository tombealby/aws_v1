package uk.co.tradewaysoftsys.pageConfiguration;

import org.springframework.ui.Model;

public class HomePageConfig {

	public static void setDisplayCvLinkWithDefaultShowLink(final Boolean displayCvLink, final Model model) {
		final Boolean defaultDisplayCvLink = true;
		setDisplayCvLinkWithDefaultAsModelAttribute(model, displayCvLink, defaultDisplayCvLink);
	}

	public static void setDisplayCvLinkWithDefaultHideLink(final Boolean displayCvLink, final Model model) {
		final Boolean defaultDisplayCvLink = false;
		setDisplayCvLinkWithDefaultAsModelAttribute(model, displayCvLink, defaultDisplayCvLink);
	}

	private static void setDisplayCvLinkWithDefaultAsModelAttribute(final Model model, final Boolean displayCvLink,
			final Boolean defaultDisplayCvLink) {
		if (displayCvLink == null) {
			model.addAttribute("displayCvLink", defaultDisplayCvLink);
		} else {
			model.addAttribute("displayCvLink", displayCvLink);
		}
	}

}
