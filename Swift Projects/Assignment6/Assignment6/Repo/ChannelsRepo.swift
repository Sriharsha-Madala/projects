//
//  ChannelsRepo.swift
//  Assignment6
//
//  Created by Sriharsha Madala on 5/19/23.
//

import Foundation

struct ChannelsRepo {
    static func get(accessToken: String, id: UUID) async throws -> ([Channels], Int) {
        print(id)
        let url = URL(string: "https://cse118.com/api/v2/workspace/\(id)/channel")!
        var request = URLRequest(url: url)
        request.setValue("application/json", forHTTPHeaderField: "Content-Type")
        request.setValue("application/json", forHTTPHeaderField: "Accept")
        request.addValue("Bearer " + accessToken, forHTTPHeaderField: "Authorization")
        request.httpMethod = "GET"
        //let jsonEncoder = JSONEncoder()
        //let jsonData = try jsonEncoder.encode(id)
        //let json = String(data: jsonData, encoding: String.Encoding.utf8)
        //print(json)
        //let bodyData = json?.data(using: .utf8)//try JSONSerialization.data(withJSONObject: json, options: [])
        //request.httpBody = bodyData
        //usleep(500*1000) // half second delay to simulate network latency
        let (data, response) = try await URLSession.shared.data(for: request)
        let httpresponse = response as? HTTPURLResponse
        print(data)
        print(httpresponse?.statusCode as Any)
        //print(try JSONDecoder().decode([Channels].self, from: data))
        return (try JSONDecoder().decode([Channels].self, from: data), httpresponse!.statusCode)
    }
}