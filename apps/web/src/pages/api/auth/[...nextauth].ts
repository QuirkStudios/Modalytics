import NextAuth from "next-auth"
import GithubProvider from "next-auth/providers/github"

export const authOptions = {
  providers: [
    GithubProvider({
      clientId: "ID",
      clientSecret: "SECRET",
    }),
  ],
}

export default NextAuth(authOptions)