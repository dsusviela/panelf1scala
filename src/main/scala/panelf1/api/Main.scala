package panelf1.api

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp.Simple:
  def run: IO[Unit] =
    Panelf1scalaServer.stream[IO].compile.drain.as(ExitCode.Success)

