package p000;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gl3 implements InputConnection {

    /* JADX INFO: renamed from: a */
    public js1 f19858a;

    /* JADX INFO: renamed from: b */
    public boolean f19859b;

    /* JADX INFO: renamed from: c */
    public uj2 f19860c;

    /* JADX INFO: renamed from: d */
    public pk4 f19861d;

    /* JADX INFO: renamed from: e */
    public fy4 f19862e;

    /* JADX INFO: renamed from: f */
    public int f19863f;

    /* JADX INFO: renamed from: g */
    public xk4 f19864g;

    /* JADX INFO: renamed from: h */
    public int f19865h;

    /* JADX INFO: renamed from: i */
    public boolean f19866i;

    /* JADX INFO: renamed from: j */
    public ArrayList f19867j;

    /* JADX INFO: renamed from: k */
    public boolean f19868k;

    /* JADX INFO: renamed from: a */
    public final void m6033a(a71 a71Var) {
        this.f19863f++;
        try {
            this.f19867j.add(a71Var);
        } finally {
            m6034b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6034b() {
        ArrayList arrayList = this.f19867j;
        int i = this.f19863f - 1;
        this.f19863f = i;
        if (i == 0 && !arrayList.isEmpty()) {
            ((vj2) this.f19858a.f22555a).f32670c.invoke(new ArrayList(arrayList));
            arrayList.clear();
        }
        return this.f19863f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f19868k;
        if (!z) {
            return z;
        }
        this.f19863f++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m6035c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f19868k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f19867j.clear();
        this.f19863f = 0;
        this.f19868k = false;
        ArrayList arrayList = ((vj2) this.f19858a.f22555a).f32677j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (z62.m13387o(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.f19868k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.f19868k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.f19868k;
        return z ? this.f19859b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.f19868k;
        if (z) {
            m6033a(new xd0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f19868k;
        if (!z) {
            return z;
        }
        m6033a(new ey0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f19868k;
        if (!z) {
            return z;
        }
        m6033a(new fy0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m6034b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f19868k;
        if (!z) {
            return z;
        }
        m6033a(new zf1());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        xk4 xk4Var = this.f19864g;
        return TextUtils.getCapsMode(xk4Var.f34341a.f24092b, ql4.m9903g(xk4Var.f34342b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f19866i = z;
        if (z) {
            this.f19865h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return oh6.m9082G(this.f19864g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (ql4.m9900d(this.f19864g.f34342b)) {
            return null;
        }
        return zt5.m13792y(this.f19864g).f24092b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return zt5.m13793z(this.f19864g, i).f24092b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return zt5.m13756A(this.f19864g, i).f24092b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f19868k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    m6033a(new w34(0, this.f19864g.f34341a.f24092b.length()));
                    break;
                case R.id.cut:
                    m6035c(277);
                    return false;
                case R.id.copy:
                    m6035c(278);
                    return false;
                case R.id.paste:
                    m6035c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f19868k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((vj2) this.f19858a.f22555a).f32671d.invoke(k12.m7357a(i2));
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d3 A[PHI: r7
  0x03d3: PHI (r7v2 int) = 
  (r7v1 int)
  (r7v1 int)
  (r7v1 int)
  (r7v15 int)
  (r7v16 int)
  (r7v17 int)
  (r7v18 int)
  (r7v19 int)
  (r7v22 int)
  (r7v28 int)
  (r7v31 int)
  (r7v38 int)
 binds: [B:5:0x0020, B:7:0x0024, B:16:0x003c, B:135:0x02e5, B:111:0x0246, B:102:0x01fc, B:97:0x01e6, B:73:0x0160, B:64:0x013e, B:52:0x00f3, B:39:0x00b3, B:26:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        byte b;
        C0875lk c0875lk;
        long jM13249h;
        int i;
        int i2;
        String string;
        int i3;
        kl4 kl4VarM11577d;
        kl4 kl4VarM11577d2;
        il4 il4Var;
        if (Build.VERSION.SDK_INT >= 34) {
            uj2 uj2Var = this.f19860c;
            pk4 pk4Var = this.f19861d;
            fy4 fy4Var = this.f19862e;
            b71 b71Var = new b71((byte) 25);
            b71Var.f15141b = this;
            VarHandle.storeStoreFence();
            int iM12995y = 3;
            if (uj2Var == null || (c0875lk = uj2Var.f31921j) == null) {
                b = 0;
            } else {
                kl4 kl4VarM11577d3 = uj2Var.m11577d();
                if (c0875lk.equals((kl4VarM11577d3 == null || (il4Var = kl4VarM11577d3.f23216a.f22400a) == null) ? null : il4Var.f21533a)) {
                    int i4 = 1;
                    if (AbstractC1243v4.m11737r(handwritingGesture)) {
                        SelectGesture selectGestureM11730k = AbstractC1243v4.m11730k(handwritingGesture);
                        long jM13345D = z62.m13345D(uj2Var, gq6.m6072J(selectGestureM11730k.getSelectionArea()), selectGestureM11730k.getGranularity() != 1 ? 0 : 1);
                        if (ql4.m9900d(jM13345D)) {
                            iM12995y = y62.m12995y(bv1.m3712n(selectGestureM11730k), b71Var);
                            b = 0;
                        } else {
                            b71Var.invoke(new w34((int) (jM13345D >> 32), (int) (jM13345D & 4294967295L)));
                            if (pk4Var != null) {
                                pk4Var.m9543e(true);
                            }
                            b = 0;
                            iM12995y = 1;
                        }
                    } else if (bv1.m3696B(handwritingGesture)) {
                        DeleteGesture deleteGestureM3710l = bv1.m3710l(handwritingGesture);
                        int i5 = deleteGestureM3710l.getGranularity() != 1 ? 0 : 1;
                        long jM13345D2 = z62.m13345D(uj2Var, gq6.m6072J(deleteGestureM3710l.getDeletionArea()), i5);
                        if (ql4.m9900d(jM13345D2)) {
                            iM12995y = y62.m12995y(bv1.m3712n(deleteGestureM3710l), b71Var);
                            b = 0;
                        } else {
                            y62.m12947O(jM13345D2, c0875lk, i5 == 1, b71Var);
                            b = 0;
                            iM12995y = 1;
                        }
                    } else if (bv1.m3697C(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureM3715q = bv1.m3715q(handwritingGesture);
                        long jM13346E = z62.m13346E(uj2Var, gq6.m6072J(selectRangeGestureM3715q.getSelectionStartArea()), gq6.m6072J(selectRangeGestureM3715q.getSelectionEndArea()), selectRangeGestureM3715q.getGranularity() != 1 ? 0 : 1);
                        if (ql4.m9900d(jM13346E)) {
                            iM12995y = y62.m12995y(bv1.m3712n(selectRangeGestureM3715q), b71Var);
                            b = 0;
                        } else {
                            b71Var.invoke(new w34((int) (jM13346E >> 32), (int) (jM13346E & 4294967295L)));
                            if (pk4Var != null) {
                                pk4Var.m9543e(true);
                            }
                            b = 0;
                            iM12995y = 1;
                        }
                    } else if (bv1.m3698D(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM3711m = bv1.m3711m(handwritingGesture);
                        int i6 = deleteRangeGestureM3711m.getGranularity() != 1 ? 0 : 1;
                        long jM13346E2 = z62.m13346E(uj2Var, gq6.m6072J(deleteRangeGestureM3711m.getDeletionStartArea()), gq6.m6072J(deleteRangeGestureM3711m.getDeletionEndArea()), i6);
                        if (ql4.m9900d(jM13346E2)) {
                            iM12995y = y62.m12995y(bv1.m3712n(deleteRangeGestureM3711m), b71Var);
                            b = 0;
                        } else {
                            y62.m12947O(jM13346E2, c0875lk, i6 == 1, b71Var);
                            b = 0;
                            iM12995y = 1;
                        }
                    } else {
                        iM12995y = 2;
                        int i7 = -1;
                        if (bv1.m3695A(handwritingGesture)) {
                            JoinOrSplitGesture joinOrSplitGestureM3713o = bv1.m3713o(handwritingGesture);
                            if (fy4Var == null) {
                                iM12995y = y62.m12995y(bv1.m3724z(joinOrSplitGestureM3713o), b71Var);
                            } else {
                                int iM13344C = z62.m13344C(uj2Var, z62.m13367Z(joinOrSplitGestureM3713o.getJoinOrSplitPoint()), fy4Var);
                                if (iM13344C == -1 || ((kl4VarM11577d2 = uj2Var.m11577d()) != null && z62.m13350I(kl4VarM11577d2.f23216a, iM13344C))) {
                                    iM12995y = y62.m12995y(bv1.m3712n(joinOrSplitGestureM3713o), b71Var);
                                } else {
                                    int iCharCount = iM13344C;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(c0875lk, iCharCount);
                                        if (!z62.m13352K(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iM13344C < c0875lk.f24092b.length()) {
                                        int iCodePointAt = Character.codePointAt(c0875lk, iM13344C);
                                        if (!z62.m13352K(iCodePointAt)) {
                                            break;
                                        } else {
                                            iM13344C += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jM10657b = sc6.m10657b(iCharCount, iM13344C);
                                    if (ql4.m9900d(jM10657b)) {
                                        int i8 = (int) (jM10657b >> 32);
                                        a71[] a71VarArr = {new w34(i8, i8), new xd0(" ", 1)};
                                        cv1 cv1Var = new cv1();
                                        cv1Var.f16507a = a71VarArr;
                                        VarHandle.storeStoreFence();
                                        b71Var.invoke(cv1Var);
                                    } else {
                                        y62.m12947O(jM10657b, c0875lk, false, b71Var);
                                    }
                                    b = 0;
                                    iM12995y = 1;
                                }
                            }
                            b = 0;
                        } else {
                            if (AbstractC1243v4.m11742w(handwritingGesture)) {
                                InsertGesture insertGestureM11729j = AbstractC1243v4.m11729j(handwritingGesture);
                                if (fy4Var == null) {
                                    iM12995y = y62.m12995y(bv1.m3724z(insertGestureM11729j), b71Var);
                                } else {
                                    int iM13344C2 = z62.m13344C(uj2Var, z62.m13367Z(insertGestureM11729j.getInsertionPoint()), fy4Var);
                                    if (iM13344C2 == -1 || ((kl4VarM11577d = uj2Var.m11577d()) != null && z62.m13350I(kl4VarM11577d.f23216a, iM13344C2))) {
                                        iM12995y = y62.m12995y(bv1.m3712n(insertGestureM11729j), b71Var);
                                    } else {
                                        a71[] a71VarArr2 = {new w34(iM13344C2, iM13344C2), new xd0(insertGestureM11729j.getTextToInsert(), 1)};
                                        cv1 cv1Var2 = new cv1();
                                        cv1Var2.f16507a = a71VarArr2;
                                        VarHandle.storeStoreFence();
                                        b71Var.invoke(cv1Var2);
                                        b = 0;
                                        iM12995y = 1;
                                    }
                                }
                            } else if (bv1.m3721w(handwritingGesture)) {
                                RemoveSpaceGesture removeSpaceGestureM3714p = bv1.m3714p(handwritingGesture);
                                kl4 kl4VarM11577d4 = uj2Var.m11577d();
                                jl4 jl4Var = kl4VarM11577d4 != null ? kl4VarM11577d4.f23216a : null;
                                long jM13367Z = z62.m13367Z(removeSpaceGestureM3714p.getStartPoint());
                                long jM13367Z2 = z62.m13367Z(removeSpaceGestureM3714p.getEndPoint());
                                cf2 cf2VarM11576c = uj2Var.m11576c();
                                if (jl4Var != null) {
                                    yu2 yu2Var = jl4Var.f22401b;
                                    if (cf2VarM11576c == null) {
                                        jM13249h = ql4.f28556b;
                                    } else {
                                        long jMo3999I = cf2VarM11576c.mo3999I(jM13367Z);
                                        long jMo3999I2 = cf2VarM11576c.mo3999I(jM13367Z2);
                                        int iM13343B = z62.m13343B(yu2Var, jMo3999I, fy4Var);
                                        int iM13343B2 = z62.m13343B(yu2Var, jMo3999I2, fy4Var);
                                        if (iM13343B != -1) {
                                            if (iM13343B2 != -1) {
                                                iM13343B = Math.min(iM13343B, iM13343B2);
                                            }
                                            iM13343B2 = iM13343B;
                                        } else if (iM13343B2 == -1) {
                                            jM13249h = ql4.f28556b;
                                        }
                                        float fM13243b = (yu2Var.m13243b(iM13343B2) + yu2Var.m13247f(iM13343B2)) / 2.0f;
                                        int i9 = (int) (jMo3999I >> 32);
                                        int i10 = (int) (jMo3999I2 >> 32);
                                        jM13249h = yu2Var.m13249h(new jl3(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), fM13243b - 0.1f, Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), fM13243b + 0.1f), 0, wv1.f33777t);
                                    }
                                } else {
                                    jM13249h = ql4.f28556b;
                                }
                                if (ql4.m9900d(jM13249h)) {
                                    iM12995y = y62.m12995y(bv1.m3712n(removeSpaceGestureM3714p), b71Var);
                                } else {
                                    String str = c0875lk.subSequence(ql4.m9903g(jM13249h), ql4.m9902f(jM13249h)).f24092b;
                                    C1283w7 c1283w7M6596u = i20.m6596u(Pattern.compile("\\s+").matcher(str), 0, str);
                                    if (c1283w7M6596u == null) {
                                        string = str.toString();
                                        b = 0;
                                        i2 = -1;
                                        i3 = -1;
                                        i = -1;
                                    } else {
                                        int length = str.length();
                                        StringBuilder sb = new StringBuilder(length);
                                        int i11 = 0;
                                        b = 0;
                                        i = -1;
                                        while (true) {
                                            sb.append((CharSequence) str, i11, c1283w7M6596u.m12121H().f27382a);
                                            if (i == i7) {
                                                i = c1283w7M6596u.m12121H().f27382a;
                                            }
                                            i2 = c1283w7M6596u.m12121H().f27383b + i4;
                                            sb.append((CharSequence) "");
                                            i11 = c1283w7M6596u.m12121H().f27383b + i4;
                                            CharSequence charSequence = (CharSequence) c1283w7M6596u.f33128d;
                                            Matcher matcher = (Matcher) c1283w7M6596u.f33127c;
                                            int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
                                            c1283w7M6596u = iEnd <= charSequence.length() ? i20.m6596u(matcher.pattern().matcher(charSequence), iEnd, charSequence) : null;
                                            if (i11 >= length || c1283w7M6596u == null) {
                                                break;
                                            }
                                            i7 = -1;
                                            i4 = 1;
                                        }
                                        if (i11 < length) {
                                            sb.append((CharSequence) str, i11, length);
                                        }
                                        string = sb.toString();
                                        i3 = -1;
                                    }
                                    if (i == i3 || i2 == i3) {
                                        iM12995y = y62.m12995y(bv1.m3712n(removeSpaceGestureM3714p), b71Var);
                                    } else {
                                        int i12 = (int) (jM13249h >> 32);
                                        int i13 = i12 + i;
                                        int i14 = i12 + i2;
                                        String strSubstring = string.substring(i, string.length() - (ql4.m9901e(jM13249h) - i2));
                                        w34 w34Var = new w34(i13, i14);
                                        xd0 xd0Var = new xd0(strSubstring, 1);
                                        a71[] a71VarArr3 = new a71[2];
                                        a71VarArr3[b] = w34Var;
                                        a71VarArr3[1] = xd0Var;
                                        cv1 cv1Var3 = new cv1();
                                        cv1Var3.f16507a = a71VarArr3;
                                        VarHandle.storeStoreFence();
                                        b71Var.invoke(cv1Var3);
                                        iM12995y = 1;
                                    }
                                }
                            } else {
                                b = 0;
                            }
                            b = 0;
                        }
                    }
                } else {
                    b = 0;
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor == null) {
                intConsumer.accept(iM12995y);
                return;
            }
            RunnableC1222uk runnableC1222uk = new RunnableC1222uk(b);
            runnableC1222uk.f31944c = intConsumer;
            runnableC1222uk.f31943b = iM12995y;
            VarHandle.storeStoreFence();
            executor.execute(runnableC1222uk);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.f19868k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C0875lk c0875lk;
        il4 il4Var;
        if (Build.VERSION.SDK_INT >= 34) {
            uj2 uj2Var = this.f19860c;
            pk4 pk4Var = this.f19861d;
            if (uj2Var != null && (c0875lk = uj2Var.f31921j) != null) {
                kl4 kl4VarM11577d = uj2Var.m11577d();
                if (c0875lk.equals((kl4VarM11577d == null || (il4Var = kl4VarM11577d.f23216a.f22400a) == null) ? null : il4Var.f21533a)) {
                    byte b = 1;
                    if (AbstractC1243v4.m11737r(previewableHandwritingGesture)) {
                        SelectGesture selectGestureM11730k = AbstractC1243v4.m11730k(previewableHandwritingGesture);
                        if (pk4Var != null) {
                            long jM13345D = z62.m13345D(uj2Var, gq6.m6072J(selectGestureM11730k.getSelectionArea()), selectGestureM11730k.getGranularity() != 1 ? 0 : 1);
                            uj2 uj2Var2 = pk4Var.f27696d;
                            if (uj2Var2 != null) {
                                uj2Var2.f31910A.setValue(ql4.m9897a(jM13345D));
                            }
                            uj2 uj2Var3 = pk4Var.f27696d;
                            if (uj2Var3 != null) {
                                uj2Var3.f31911B.setValue(ql4.m9897a(ql4.f28556b));
                            }
                            if (!ql4.m9900d(jM13345D)) {
                                pk4Var.m9559u(false);
                                pk4Var.m9556r(wu1.f33741a);
                            }
                        }
                    } else if (bv1.m3696B(previewableHandwritingGesture)) {
                        DeleteGesture deleteGestureM3710l = bv1.m3710l(previewableHandwritingGesture);
                        if (pk4Var != null) {
                            long jM13345D2 = z62.m13345D(uj2Var, gq6.m6072J(deleteGestureM3710l.getDeletionArea()), deleteGestureM3710l.getGranularity() != 1 ? 0 : 1);
                            uj2 uj2Var4 = pk4Var.f27696d;
                            if (uj2Var4 != null) {
                                uj2Var4.f31911B.setValue(ql4.m9897a(jM13345D2));
                            }
                            uj2 uj2Var5 = pk4Var.f27696d;
                            if (uj2Var5 != null) {
                                uj2Var5.f31910A.setValue(ql4.m9897a(ql4.f28556b));
                            }
                            if (!ql4.m9900d(jM13345D2)) {
                                pk4Var.m9559u(false);
                                pk4Var.m9556r(wu1.f33741a);
                            }
                        }
                    } else if (bv1.m3697C(previewableHandwritingGesture)) {
                        SelectRangeGesture selectRangeGestureM3715q = bv1.m3715q(previewableHandwritingGesture);
                        if (pk4Var != null) {
                            long jM13346E = z62.m13346E(uj2Var, gq6.m6072J(selectRangeGestureM3715q.getSelectionStartArea()), gq6.m6072J(selectRangeGestureM3715q.getSelectionEndArea()), selectRangeGestureM3715q.getGranularity() != 1 ? 0 : 1);
                            uj2 uj2Var6 = pk4Var.f27696d;
                            if (uj2Var6 != null) {
                                uj2Var6.f31910A.setValue(ql4.m9897a(jM13346E));
                            }
                            uj2 uj2Var7 = pk4Var.f27696d;
                            if (uj2Var7 != null) {
                                uj2Var7.f31911B.setValue(ql4.m9897a(ql4.f28556b));
                            }
                            if (!ql4.m9900d(jM13346E)) {
                                pk4Var.m9559u(false);
                                pk4Var.m9556r(wu1.f33741a);
                            }
                        }
                    } else if (bv1.m3698D(previewableHandwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM3711m = bv1.m3711m(previewableHandwritingGesture);
                        if (pk4Var != null) {
                            long jM13346E2 = z62.m13346E(uj2Var, gq6.m6072J(deleteRangeGestureM3711m.getDeletionStartArea()), gq6.m6072J(deleteRangeGestureM3711m.getDeletionEndArea()), deleteRangeGestureM3711m.getGranularity() != 1 ? 0 : 1);
                            uj2 uj2Var8 = pk4Var.f27696d;
                            if (uj2Var8 != null) {
                                uj2Var8.f31911B.setValue(ql4.m9897a(jM13346E2));
                            }
                            uj2 uj2Var9 = pk4Var.f27696d;
                            if (uj2Var9 != null) {
                                uj2Var9.f31910A.setValue(ql4.m9897a(ql4.f28556b));
                            }
                            if (!ql4.m9900d(jM13346E2)) {
                                pk4Var.m9559u(false);
                                pk4Var.m9556r(wu1.f33741a);
                            }
                        }
                    }
                    if (cancellationSignal != null) {
                        xh0 xh0Var = new xh0(b);
                        xh0Var.f34278b = pk4Var;
                        VarHandle.storeStoreFence();
                        cancellationSignal.setOnCancelListener(xh0Var);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z = this.f19868k;
        if (!z) {
            return z;
        }
        boolean z2 = false;
        boolean z3 = (i & 1) != 0;
        boolean z4 = (i & 2) != 0;
        boolean z5 = (i & 16) != 0;
        boolean z6 = (i & 8) != 0;
        boolean z7 = (i & 4) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34 && (i & 32) != 0) {
            z2 = true;
        }
        if (!z5 && !z6 && !z7 && !z2) {
            if (i2 >= 34) {
                z2 = true;
                z5 = true;
            } else {
                z5 = true;
            }
            z6 = z5;
            z7 = z6;
        }
        fj2 fj2Var = ((vj2) this.f19858a.f22555a).f32680m;
        synchronized (fj2Var.f19026c) {
            try {
                fj2Var.f19029f = z5;
                fj2Var.f19030g = z6;
                fj2Var.f19031h = z7;
                fj2Var.f19032i = z2;
                if (z3) {
                    fj2Var.f19028e = true;
                    if (fj2Var.f19033j != null) {
                        fj2Var.m5726a();
                    }
                }
                fj2Var.f19027d = z4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f19868k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((vj2) this.f19858a.f22555a).f32678k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f19868k;
        if (z) {
            m6033a(new u34(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.f19868k;
        if (z) {
            m6033a(new v34(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f19868k;
        if (!z) {
            return z;
        }
        m6033a(new w34(i, i2));
        return true;
    }
}
