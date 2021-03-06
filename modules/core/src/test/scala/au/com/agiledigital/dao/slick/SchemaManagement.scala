package au.com.agiledigital.dao.slick

trait SchemaManagement[Entity, PendingEntity] {
  self: EntityActions[Entity, PendingEntity] =>

  import profile.api._

  def createSchema: DBIO[Unit] = tableQuery.schema.create

  def dropSchema: DBIO[Unit] = tableQuery.schema.drop
}
