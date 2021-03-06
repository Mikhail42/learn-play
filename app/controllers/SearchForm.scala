package controllers

object SearchForm {
  import play.api.data.Forms._
  import play.api.data.Form

  case class Data(searchRequest: String)

  val form: Form[Data] = Form[Data](
    mapping(
      "query" -> nonEmptyText
    )(Data.apply)(Data.unapply)
  )
}
