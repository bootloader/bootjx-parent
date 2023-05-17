package com.boot.loaderjs;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.boot.jx.dict.Language;
import com.boot.utils.ArgUtil;
import com.github.gianlucanitti.javaexpreval.ExpressionException;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class LanguageTest {

	private static Logger LOGGER = LoggerFactory.getLogger(LanguageTest.class);

	public static void main(String[] args) throws ExpressionException {

		Locale[] locales = Locale.getAvailableLocales();
		for (Locale locale : locales) {
			LOGGER.info("{} - {} - {} - {}", locale.toString(), locale.getISO3Language(),
				locale.getLanguage(),
				locale.getDisplayName());
		}

	}

	@Test
	public void testLanguageEnumFromNumber() {
		Language lang = Language.fromId(Language.PH.getBDCode());
		assertTrue( lang == Language.TL, "Lang is not TL");
	}

	@Test
	public void testLanguageFromAlias() {
		Language lang = Language.fromString("ph", Language.EN);
		assertTrue(lang == Language.TL, "Lang is not TL");
	}

	@Test
	public void testLanguageFromStringWithDefault() {
		Language lang = (Language) ArgUtil.parseAsEnum("ph", Language.EN, Language.class);
		assertTrue( lang == Language.PH, "Lang is not PH");
	}

	@Test
	public void testLanguageFromString() {
		Language lang = (Language) ArgUtil.parseAsEnum("ph", Language.class);
		assertTrue(lang == Language.PH, "Lang is not PH");
	}
}
