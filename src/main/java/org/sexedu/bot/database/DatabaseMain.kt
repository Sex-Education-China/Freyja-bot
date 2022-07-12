package org.sexedu.bot.database

import com.mongodb.MongoClient
import org.bson.Document

object DatabaseMain {
    var client = MongoClient("127.0.0.1", 27017)
    var database = client.getDatabase("bornhub")
    var collection = database.getCollection("users")
    var findIterable = collection.find()
    var cursor = findIterable.iterator()
    fun DatabaseMain() {

    }
    //find a user by username
    fun getUser(username: String): Document? {
        var findIterable = collection.find(Document("username", username))
        var cursor = findIterable.iterator()
        if (cursor.hasNext()) {
            return cursor.next()
        }
        return null
    }

    fun registerUser(username: String, password: String, id: String) {
        var doc = Document("username", username).append("id", id).append("password", password)
        collection.insertOne(doc)
    }

    fun isExits(id: String): Boolean {
        var findIterable = collection.find(Document("id", id))
        var cursor = findIterable.iterator()
        return cursor.hasNext()
    }
}