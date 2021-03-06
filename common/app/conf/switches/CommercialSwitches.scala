package conf.switches

import conf.switches.Expiry.never
import org.joda.time.LocalDate

trait CommercialSwitches {

  val CommercialSwitch = Switch(
    SwitchGroup.Commercial,
    "commercial",
    "If this switch is OFF, no calls will be made to the ad server. BEWARE!",
    owners = Seq(Owner.withName("commercial team")),
    safeState = On,
    sellByDate = never,
    exposeClientSide = true
  )

  val AdFreeTrialSwitch = Switch(
    SwitchGroup.Commercial,
    "ad-free-membership-trial",
    "Master switch for trialling ad-free membership perk",
    owners = Seq(Owner.withGithub("JustinPinner")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = true
  )

  val AudienceScienceGatewaySwitch = Switch(
    SwitchGroup.Commercial,
    "audience-science-gateway",
    "If this switch is on, Audience Science Gateway segments will be used to target ads.",
    owners = Seq(Owner.withName("commercial team")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = true
  )

  val ImrWorldwideSwitch = Switch(
    SwitchGroup.Commercial,
    "imr-worldwide",
    "Enable the IMR Worldwide audience segment tracking.",
    owners = Seq(Owner.withName("commercial team")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = true
  )

  val KruxSwitch = Switch(
    SwitchGroup.Commercial,
    "krux",
    "Enable Krux Control Tag",
    owners = Seq(Owner.withName("commercial team")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = true
  )

  val RemarketingSwitch = Switch(
    SwitchGroup.Commercial,
    "remarketing",
    "Enable Remarketing tracking",
    owners = Seq(Owner.withName("commercial team")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = true
  )

  val TravelFeedFetchSwitch = Switch(
    SwitchGroup.CommercialFeeds,
    "gu-travel-feed-fetch",
    "If this switch is on, cached travel offers feed will be updated from external source.",
    owners = Seq(Owner.withGithub("kelvin-chappell")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = false
  )

  val TravelFeedParseSwitch = Switch(
    SwitchGroup.CommercialFeeds,
    "gu-travel-feed-parse",
    "If this switch is on, commercial components will be fed by travel offers feed.",
    owners = Seq(Owner.withGithub("kelvin-chappell")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = false
  )

  val JobsFeedFetchSwitch = Switch(
    SwitchGroup.CommercialFeeds,
    "gu-jobs-feed-fetch",
    "If this switch is on, jobs feed will be periodically updated from external source.",
    owners = Seq(Owner.withGithub("rich-nguyen")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = false
  )

  val JobsFeedParseSwitch = Switch(
    SwitchGroup.CommercialFeeds,
    "gu-jobs-feed-parse",
    "If this switch is on, commercial components will be fed by jobs feed.",
    owners = Seq(Owner.withGithub("rich-nguyen")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = false
  )

  val EventsFeedSwitch = Switch(
    SwitchGroup.CommercialFeeds,
    "gu-events",
    "If this switch is on, commercial components will be fed by masterclass and live-events feeds.",
    owners = Seq(Owner.withName("commercial team")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = false
  )

  val SoulmatesFeedSwitch = Switch(
    SwitchGroup.CommercialFeeds,
    "gu-soulmates",
    "If this switch is on, commercial components will be fed by soulmates feed.",
    owners = Seq(Owner.withName("commercial team")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = false
  )

  val GuBookshopFeedsSwitch = Switch(
    SwitchGroup.CommercialFeeds,
    "gu-bookshop",
    "If this switch is on, commercial components will be fed by the Guardian Bookshop feed.",
    owners = Seq(Owner.withName("commercial team")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = false
  )

  val BookLookupSwitch = Switch(
    SwitchGroup.CommercialFeeds,
    "book-lookup",
    "If this switch is on, book data will be looked up using a third-party service.",
    owners = Seq(Owner.withName("commercial team")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = false
  )

  val MembershipEngagementBanner = Switch(
    SwitchGroup.Commercial,
    "membership-engagement-banner",
    "Master switch for the membership engagement banner.",
    owners = Seq(Owner.withGithub("justinpinner")),
    safeState = On,
    sellByDate = never,
    exposeClientSide = true
  )

  val AdBlockMessage = Switch(
    SwitchGroup.Commercial,
    "adblock",
    "Switch for the Adblock Message.",
    owners = Seq(Owner.withName("commercial team")),
    safeState = Off,
    sellByDate = never,
    exposeClientSide = true
  )

  val KruxVideoTracking = Switch(
    SwitchGroup.Commercial,
    "krux-video-tracking",
    "If this switch is ON, there will be a Krux pixel fired to track particular videos",
    owners = Seq(Owner.withGithub("commercial team")),
    safeState = On,
    sellByDate = never,
    exposeClientSide = true
  )

  val sonobiSwitch: Switch = Switch(
    group = SwitchGroup.Commercial,
    name = "sonobi-header-bidding",
    description = "Turn on Sonobi header bidding",
    owners = Seq(Owner.withGithub("rich-nguyen"), Owner.withGithub("janua")),
    safeState = Off,
    sellByDate = new LocalDate(2017, 3, 31), //Friday
    exposeClientSide = true
  )

  val renaultSwitch: Switch = Switch(
    group = SwitchGroup.Commercial,
    name = "renault",
    description = "Turn on hardcoded Renault campaign",
    owners = Owner.group(SwitchGroup.Commercial),
    safeState = On,
    sellByDate = new LocalDate(2017, 3, 1),
    exposeClientSide = false
  )
}
