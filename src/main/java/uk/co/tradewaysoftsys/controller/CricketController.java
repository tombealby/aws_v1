package uk.co.tradewaysoftsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CricketController {

	@GetMapping("/tombealby/cricket/ashes")
	public String showCricketAverages2023() {
		return "fragments/tombealby/cricket/cricketAverages2023";
	}

	@GetMapping("/tombealby/cricket/ashes/englandBatting")
	public String showCricketAverages2023EnglandBatting() {
		return "fragments/tombealby/cricket/cricketAverages2023EnglandBatting.html";
	}

	@GetMapping("/tombealby/cricket/ashes/englandBowling")
	public String showCricketAverages2023EnglandBowling() {
		return "fragments/tombealby/cricket/cricketAverages2023EnglandBowling.html";
	}

	@GetMapping("/tombealby/cricket/ashes/australiaBatting")
	public String showCricketAverages2023AustraliaBatting() {
		return "fragments/tombealby/cricket/cricketAverages2023AustraliaBatting.html";
	}

	@GetMapping("/tombealby/cricket/ashes/australiaBowling")
	public String showCricketAverages2023AustraliaBowling() {
		return "fragments/tombealby/cricket/cricketAverages2023AustraliaBowling.html";
	}

}
