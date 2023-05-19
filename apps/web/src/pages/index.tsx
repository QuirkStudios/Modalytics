import Head from 'next/head'

import { useSession, signIn, signOut } from "next-auth/react"

export default function Home() {
  const { data: session } = useSession()
  if(!session) {
    return (
      <>
        <Head>
          <title>Modalytics</title>
        </Head>
        <main>
          <h1>Modalytics</h1>
          <button onClick={() => signIn()}>Sign in</button>
        </main>
      </>
    );
  }
  return (
    <>
      <Head>
        <title>Modalytics</title>
      </Head>
      <main>
        <h1>Modalytics</h1>
        <p>{session.user.name}</p>
        <p>{session.user.email}</p>
        <img src={session.user.image} alt={session.user.image} />
        <button onClick={() => signOut()}>Sign out</button>
      </main>
    </>
  );
}