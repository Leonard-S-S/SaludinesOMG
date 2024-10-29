/* SaludinTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. SaludinTokenManager.java */
//cls
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/** Token Manager. */
@SuppressWarnings("unused")public class SaludinTokenManager implements SaludinConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0xc00L) != 0L)
            return 1;
         if ((active0 & 0x3ffff81000L) != 0L)
         {
            jjmatchedKind = 41;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0x881000L) != 0L)
            return 1;
         if ((active0 & 0x3fff700000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x28a1000000L) != 0L)
            return 1;
         if ((active0 & 0x175e700000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x144300000L) != 0L)
            return 1;
         if ((active0 & 0x161a400000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x1208000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x412400000L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0x208000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x1000000000L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0x208000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 6;
            return 1;
         }
         return -1;
      case 7:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 7;
            return 1;
         }
         if ((active0 & 0x8000000L) != 0L)
            return 1;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 40:
         return jjStopAtPos(0, 48);
      case 41:
         return jjStopAtPos(0, 49);
      case 42:
         return jjStopAtPos(0, 7);
      case 43:
         return jjStopAtPos(0, 5);
      case 44:
         return jjStopAtPos(0, 50);
      case 45:
         return jjStopAtPos(0, 6);
      case 47:
         return jjStopAtPos(0, 8);
      case 58:
         return jjStopAtPos(0, 38);
      case 59:
         return jjStopAtPos(0, 47);
      case 60:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 61:
         jjmatchedKind = 9;
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 62:
         jjmatchedKind = 15;
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 79:
         return jjStartNfaWithStates_0(0, 11, 1);
      case 89:
         return jjStartNfaWithStates_0(0, 10, 1);
      case 91:
         return jjStopAtPos(0, 39);
      case 93:
         return jjStopAtPos(0, 40);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x110000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x2000800000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x28200000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x401000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         else if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         else if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         break;
      case 79:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(1, 12, 1);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1480000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2244000000L);
      case 102:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(1, 19, 1);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x500000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x22000000L);
      case 111:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(1, 23, 1);
         return jjMoveStringLiteralDfa2_0(active0, 0x101000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x810000000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x14100000L);
      case 102:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 37, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 114:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(2, 24, 1);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(2, 31, 1);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(2, 35, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      case 116:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x1002000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 108:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 1);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 110:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 1);
         break;
      case 114:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x1008000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(4, 22, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x1008000000L);
      case 107:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(4, 28, 1);
         break;
      case 108:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 1);
         break;
      case 111:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(4, 34, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 122:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 36, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 114:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(7, 27, 1);
         return jjMoveStringLiteralDfa8_0(active0, 0x200000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 111:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(8, 33, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 11;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                     { jjCheckNAddTwoStates(2, 3); }
                  }
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 9;
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  { jjCheckNAddTwoStates(2, 3); }
                  break;
               case 3:
                  if (curChar == 46)
                     { jjCheckNAdd(4); }
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  { jjCheckNAdd(4); }
                  break;
               case 5:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 6:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(6, 7); }
                  break;
               case 7:
                  if (curChar == 34 && kind > 45)
                     kind = 45;
                  break;
               case 8:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 10:
                  if (curChar == 39 && kind > 46)
                     kind = 46;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAdd(1); }
                  break;
               case 6:
                  { jjAddStates(0, 1); }
                  break;
               case 9:
                  jjstateSet[jjnewStateCnt++] = 10;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 6:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(0, 1); }
                  break;
               case 9:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   6, 7, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\55", "\52", "\57", "\75", "\131", "\117", 
"\116\117", "\75\75", "\41\75", "\76", "\74", "\76\75", "\74\75", "\151\146", 
"\164\150\145\156", "\145\154\163\145", "\167\150\151\154\145", "\144\157", "\146\157\162", 
"\165\156\164\151\154", "\154\145\145\162", "\145\163\143\162\151\142\151\162", 
"\142\162\145\141\153", "\145\156\164", "\162\145\141\154", "\143\141\162", "\142\157\157\154", 
"\166\145\162\144\141\144\145\162\157", "\146\141\154\163\157", "\141\162\162", "\155\141\164\162\151\172", 
"\144\145\146", "\72", "\133", "\135", null, null, null, null, null, null, "\73", "\50", 
"\51", "\54", null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 51)
   {
      jjmatchedKind = 51;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public SaludinTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public SaludinTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 11; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xff3ffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[11];
    private final int[] jjstateSet = new int[2 * 11];

    
    protected char curChar;
}
