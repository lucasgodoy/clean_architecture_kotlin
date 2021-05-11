package org.project1.adapter.repository.mapper

import org.project1.adapter.repository.DbFoo
import org.project1.entity.Foo

internal fun Foo.toDbSchema() = DbFoo(id = id, name = name)