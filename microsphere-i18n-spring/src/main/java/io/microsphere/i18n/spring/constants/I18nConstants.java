package io.microsphere.i18n.spring.constants;

import io.microsphere.i18n.ServiceMessageSource;

import java.util.Locale;

/**
 * Internationalization property constants
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy<a/>
 * @since 1.0.0
 */
public interface I18nConstants {

    String PROPERTY_NAME_PREFIX = "microsphere.i18n.";

    /**
     * Enabled Configuration Name
     */
    String ENABLED_PROPERTY_NAME = PROPERTY_NAME_PREFIX + "enabled";

    /**
     * Enabled By Default
     */
    boolean DEFAULT_ENABLED = true;

    /**
     * The property name of the {@link ServiceMessageSource#getSource() sources} of {@link ServiceMessageSource}
     *
     * @see ServiceMessageSource#getSource()
     */
    String SOURCES_PROPERTY_NAME = PROPERTY_NAME_PREFIX + "sources";

    /**
     * Default {@link Locale} property name
     */
    String DEFAULT_LOCALE_PROPERTY_NAME = PROPERTY_NAME_PREFIX + "default-locale";

    /**
     * Supported {@link Locale} list property names
     */
    String SUPPORTED_LOCALES_PROPERTY_NAME = PROPERTY_NAME_PREFIX + "supported-locales";

    /**
     * The Primary {@link ServiceMessageSource} Bean Bean
     */
    String SERVICE_MESSAGE_SOURCE_BEAN_NAME = "serviceMessageSource";
}
