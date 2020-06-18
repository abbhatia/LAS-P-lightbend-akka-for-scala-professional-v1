resolvers in ThisBuild += "lightbend-commercial-mvn" at
  "https://repo.lightbend.com/pass/lkWyk6Nf4d799PRxZhf8FH6uwwA1qAInXVze40CdSpH6iKE8/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
  url("https://repo.lightbend.com/pass/lkWyk6Nf4d799PRxZhf8FH6uwwA1qAInXVze40CdSpH6iKE8/commercial-releases"))(Resolver.ivyStylePatterns)