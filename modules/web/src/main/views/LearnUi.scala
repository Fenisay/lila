package lila.web
package views

import play.api.libs.json.Json

import lila.ui.*
import ScalatagsTemplate.{ *, given }

final class LearnUi(helpers: Helpers):
  import helpers.{ *, given }
  import trans.{ learn as trl }

  def apply(data: Option[play.api.libs.json.JsValue])(using Context) =
    Page(s"${trl.learnChess.txt()} - ${trl.byPlaying.txt()}")
      .js:
        PageModule(
          "learn",
          Json.obj("data" -> data, "i18n" -> i18nJsObject(i18nKeys))
        )
      .cssTag("learn")
      .graph(
        title = "Learn chess by playing",
        description = "You don't know much about chess? Excellent! Let's have fun and learn to play chess!",
        url = s"$netBaseUrl${routes.Learn.index}"
      )
      .hrefLangs(lila.ui.LangPath(routes.Learn.index))
      .zoom:
        main(id := "learn-app")

  private val i18nKeys = List(
    trans.learn.play,
    trans.site.yourScore,
    trl.learnChess,
    trl.byPlaying,
    trl.menu,
    trl.progressX,
    trl.resetMyProgress,
    trl.youWillLoseAllYourProgress,
    trl.chessPieces,
    trl.theRook,
    trl.itMovesInStraightLines,
    trl.rookIntro,
    trl.rookGoal,
    trl.grabAllTheStars,
    trl.theFewerMoves,
    trl.useTwoRooks,
    trl.rookComplete,
    trl.theBishop,
    trl.itMovesDiagonally,
    trl.bishopIntro,
    trl.youNeedBothBishops,
    trl.bishopComplete,
    trl.theQueen,
    trl.queenCombinesRookAndBishop,
    trl.queenIntro,
    trl.queenComplete,
    trl.theKing,
    trl.theMostImportantPiece,
    trl.kingIntro,
    trl.theKingIsSlow,
    trl.lastOne,
    trl.kingComplete,
    trl.theKnight,
    trl.itMovesInAnLShape,
    trl.knightIntro,
    trl.knightsHaveAFancyWay,
    trl.knightsCanJumpOverObstacles,
    trl.knightComplete,
    trl.thePawn,
    trl.itMovesForwardOnly,
    trl.pawnIntro,
    trl.pawnsMoveOneSquareOnly,
    trl.mostOfTheTimePromotingToAQueenIsBest,
    trl.pawnsMoveForward,
    trl.captureThenPromote,
    trl.useAllThePawns,
    trl.aPawnOnTheSecondRank,
    trl.grabAllTheStarsNoNeedToPromote,
    trl.pawnComplete,
    trl.pawnPromotion,
    trl.yourPawnReachedTheEndOfTheBoard,
    trl.itNowPromotesToAStrongerPiece,
    trl.selectThePieceYouWant,
    trl.fundamentals,
    trl.capture,
    trl.takeTheEnemyPieces,
    trl.captureIntro,
    trl.takeTheBlackPieces,
    trl.takeTheBlackPiecesAndDontLoseYours,
    trl.captureComplete,
    trl.protection,
    trl.keepYourPiecesSafe,
    trl.protectionIntro,
    trl.protectionComplete,
    trl.escape,
    trl.noEscape,
    trl.dontLetThemTakeAnyUndefendedPiece,
    trl.combat,
    trl.captureAndDefendPieces,
    trl.combatIntro,
    trl.combatComplete,
    trl.checkInOne,
    trl.attackTheOpponentsKing,
    trl.checkInOneIntro,
    trl.checkInOneGoal,
    trl.checkInOneComplete,
    trl.outOfCheck,
    trl.defendYourKing,
    trl.outOfCheckIntro,
    trl.escapeWithTheKing,
    trl.theKingCannotEscapeButBlock,
    trl.youCanGetOutOfCheckByTaking,
    trl.thisKnightIsCheckingThroughYourDefenses,
    trl.escapeOrBlock,
    trl.outOfCheckComplete,
    trl.mateInOne,
    trl.defeatTheOpponentsKing,
    trl.mateInOneIntro,
    trl.attackYourOpponentsKing,
    trl.mateInOneComplete,
    trl.intermediate,
    trl.boardSetup,
    trl.howTheGameStarts,
    trl.boardSetupIntro,
    trl.thisIsTheInitialPosition,
    trl.firstPlaceTheRooks,
    trl.thenPlaceTheKnights,
    trl.placeTheBishops,
    trl.placeTheQueen,
    trl.placeTheKing,
    trl.pawnsFormTheFrontLine,
    trl.boardSetupComplete,
    trl.castling,
    trl.theSpecialKingMove,
    trl.castlingIntro,
    trl.castleKingSide,
    trl.castleQueenSide,
    trl.theKnightIsInTheWay,
    trl.castleKingSideMovePiecesFirst,
    trl.castleQueenSideMovePiecesFirst,
    trl.youCannotCastleIfMoved,
    trl.youCannotCastleIfAttacked,
    trl.findAWayToCastleKingSide,
    trl.findAWayToCastleQueenSide,
    trl.castlingComplete,
    trl.enPassant,
    trl.theSpecialPawnMove,
    trl.enPassantIntro,
    trl.blackJustMovedThePawnByTwoSquares,
    trl.enPassantOnlyWorksImmediately,
    trl.enPassantOnlyWorksOnFifthRank,
    trl.takeAllThePawnsEnPassant,
    trl.enPassantComplete,
    trl.stalemate,
    trl.theGameIsADraw,
    trl.stalemateIntro,
    trl.stalemateGoal,
    trl.stalemateComplete,
    trl.advanced,
    trl.pieceValue,
    trl.evaluatePieceStrength,
    trl.pieceValueIntro,
    trl.queenOverBishop,
    trl.takeThePieceWithTheHighestValue,
    trl.pieceValueLegal,
    trl.pieceValueExchange,
    trl.pieceValueComplete,
    trl.checkInTwo,
    trl.twoMovesToGiveCheck,
    trl.checkInTwoIntro,
    trl.checkInTwoGoal,
    trl.checkInTwoComplete,
    trl.whatNext,
    trl.youKnowHowToPlayChess,
    trl.register,
    trl.getAFreeLichessAccount,
    trl.practice,
    trl.learnCommonChessPositions,
    trl.puzzles,
    trl.exerciseYourTacticalSkills,
    trl.videos,
    trl.watchInstructiveChessVideos,
    trl.playPeople,
    trl.opponentsFromAroundTheWorld,
    trl.playMachine,
    trl.testYourSkillsWithTheComputer,
    trl.letsGo,
    trl.stageX,
    trl.awesome,
    trl.excellent,
    trl.greatJob,
    trl.perfect,
    trl.outstanding,
    trl.wayToGo,
    trl.yesYesYes,
    trl.youreGoodAtThis,
    trl.nailedIt,
    trl.rightOn,
    trl.stageXComplete,
    trl.next,
    trl.nextX,
    trl.backToMenu,
    trl.puzzleFailed,
    trl.retry
  )
