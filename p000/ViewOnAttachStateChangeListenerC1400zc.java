package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.C0995R;

/* JADX INFO: renamed from: zc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1400zc extends AbstractC0513c3 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: N */
    public static final kv2 f35937N;

    /* JADX INFO: renamed from: A */
    public mv2 f35938A;

    /* JADX INFO: renamed from: B */
    public jv2 f35939B;

    /* JADX INFO: renamed from: C */
    public jv2 f35940C;

    /* JADX INFO: renamed from: D */
    public String f35941D;

    /* JADX INFO: renamed from: E */
    public String f35942E;

    /* JADX INFO: renamed from: F */
    public tt2 f35943F;

    /* JADX INFO: renamed from: G */
    public lv2 f35944G;

    /* JADX INFO: renamed from: H */
    public j14 f35945H;

    /* JADX INFO: renamed from: I */
    public boolean f35946I;

    /* JADX INFO: renamed from: J */
    public jv2 f35947J;

    /* JADX INFO: renamed from: K */
    public RunnableC1054q0 f35948K;

    /* JADX INFO: renamed from: L */
    public ArrayList f35949L;

    /* JADX INFO: renamed from: M */
    public C1177tc f35950M;

    /* JADX INFO: renamed from: d */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f35951d;

    /* JADX INFO: renamed from: e */
    public int f35952e;

    /* JADX INFO: renamed from: f */
    public C1177tc f35953f;

    /* JADX INFO: renamed from: g */
    public AccessibilityManager f35954g;

    /* JADX INFO: renamed from: h */
    public long f35955h;

    /* JADX INFO: renamed from: i */
    public List f35956i;

    /* JADX INFO: renamed from: j */
    public C1251vc f35957j;

    /* JADX INFO: renamed from: k */
    public int f35958k;

    /* JADX INFO: renamed from: l */
    public int f35959l;

    /* JADX INFO: renamed from: m */
    public C1242v3 f35960m;

    /* JADX INFO: renamed from: n */
    public C1242v3 f35961n;

    /* JADX INFO: renamed from: o */
    public boolean f35962o;

    /* JADX INFO: renamed from: p */
    public lv2 f35963p;

    /* JADX INFO: renamed from: q */
    public lv2 f35964q;

    /* JADX INFO: renamed from: r */
    public ra4 f35965r;

    /* JADX INFO: renamed from: s */
    public ra4 f35966s;

    /* JADX INFO: renamed from: t */
    public int f35967t;

    /* JADX INFO: renamed from: u */
    public Integer f35968u;

    /* JADX INFO: renamed from: v */
    public C0879lo f35969v;

    /* JADX INFO: renamed from: w */
    public f40 f35970w;

    /* JADX INFO: renamed from: x */
    public boolean f35971x;

    /* JADX INFO: renamed from: y */
    public C1288wc f35972y;

    /* JADX INFO: renamed from: z */
    public lv2 f35973z;

    static {
        int[] iArr = {C0995R.id.accessibility_custom_action_0, C0995R.id.accessibility_custom_action_1, C0995R.id.accessibility_custom_action_2, C0995R.id.accessibility_custom_action_3, C0995R.id.accessibility_custom_action_4, C0995R.id.accessibility_custom_action_5, C0995R.id.accessibility_custom_action_6, C0995R.id.accessibility_custom_action_7, C0995R.id.accessibility_custom_action_8, C0995R.id.accessibility_custom_action_9, C0995R.id.accessibility_custom_action_10, C0995R.id.accessibility_custom_action_11, C0995R.id.accessibility_custom_action_12, C0995R.id.accessibility_custom_action_13, C0995R.id.accessibility_custom_action_14, C0995R.id.accessibility_custom_action_15, C0995R.id.accessibility_custom_action_16, C0995R.id.accessibility_custom_action_17, C0995R.id.accessibility_custom_action_18, C0995R.id.accessibility_custom_action_19, C0995R.id.accessibility_custom_action_20, C0995R.id.accessibility_custom_action_21, C0995R.id.accessibility_custom_action_22, C0995R.id.accessibility_custom_action_23, C0995R.id.accessibility_custom_action_24, C0995R.id.accessibility_custom_action_25, C0995R.id.accessibility_custom_action_26, C0995R.id.accessibility_custom_action_27, C0995R.id.accessibility_custom_action_28, C0995R.id.accessibility_custom_action_29, C0995R.id.accessibility_custom_action_30, C0995R.id.accessibility_custom_action_31};
        kv2 kv2Var = k52.f22902a;
        kv2 kv2Var2 = new kv2(32);
        int i = kv2Var2.f23538b;
        if (i < 0) {
            kx5.m7733s0("");
            throw null;
        }
        int i2 = i + 32;
        kv2Var2.m7634b(i2);
        int[] iArr2 = kv2Var2.f23537a;
        int i3 = kv2Var2.f23538b;
        if (i != i3) {
            AbstractC0990oo.m9199T(iArr2, iArr2, i2, i, i3);
        }
        AbstractC0990oo.m9204Y(iArr, iArr2, i, 0, 12);
        kv2Var2.f23538b += 32;
        f35937N = kv2Var2;
    }

    /* JADX INFO: renamed from: F */
    public static Rect m13466F(lb5 lb5Var, float f, float f2) {
        if (!(lb5Var instanceof h63) && !(lb5Var instanceof i63)) {
            return null;
        }
        jl3 jl3VarMo5906M = lb5Var.mo5906M();
        return new Rect((int) (jl3VarMo5906M.f22396a + f), (int) (jl3VarMo5906M.f22397b + f2), (int) (jl3VarMo5906M.f22398c + f), (int) (jl3VarMo5906M.f22399d + f2));
    }

    /* JADX INFO: renamed from: H */
    public static float[] m13467H(lb5 lb5Var) {
        if (!(lb5Var instanceof i63)) {
            return null;
        }
        cr3 cr3Var = ((i63) lb5Var).f21139o;
        long j = cr3Var.f16398h;
        long j2 = cr3Var.f16397g;
        long j3 = cr3Var.f16396f;
        long j4 = cr3Var.f16395e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    /* JADX INFO: renamed from: I */
    public static Region m13468I(lb5 lb5Var, float f, float f2) {
        if (lb5Var instanceof g63) {
            g63 g63Var = (g63) lb5Var;
            jl3 jl3VarM7173i = g63Var.mo5906M().m7173i(f, f2);
            Region region = new Region(new Rect((int) (jl3VarM7173i.f22396a + 0.0f), (int) (jl3VarM7173i.f22397b + 0.0f), (int) (jl3VarM7173i.f22398c + 0.0f), (int) (jl3VarM7173i.f22399d + 0.0f)));
            Region region2 = new Region();
            C0489bf c0489bf = g63Var.f19622o;
            if (c0489bf instanceof C0489bf) {
                Path path = c0489bf.f15228a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            qm5.m9919j("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static CharSequence m13469J(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: m */
    public static String m13470m(i14 i14Var) {
        C0875lk c0875lk;
        if (i14Var != null) {
            e14 e14Var = i14Var.f21012d;
            lw2 lw2Var = e14Var.f17631a;
            p14 p14Var = m14.f24552a;
            if (lw2Var.m8128c(p14Var)) {
                return yl2.m13170a((List) e14Var.m4900c(p14Var), ",", null, 62);
            }
            p14 p14Var2 = m14.f24539F;
            if (lw2Var.m8128c(p14Var2)) {
                Object objM8132g = lw2Var.m8132g(p14Var2);
                if (objM8132g == null) {
                    objM8132g = null;
                }
                C0875lk c0875lk2 = (C0875lk) objM8132g;
                if (c0875lk2 != null) {
                    return c0875lk2.f24092b;
                }
            } else {
                Object objM8132g2 = lw2Var.m8132g(m14.f24535B);
                if (objM8132g2 == null) {
                    objM8132g2 = null;
                }
                List list = (List) objM8132g2;
                if (list != null && (c0875lk = (C0875lk) hb0.m6301M0(list)) != null) {
                    return c0875lk.f24092b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m13471q(ww3 ww3Var, float f) {
        wp1 wp1Var = ww3Var.f33800a;
        if (f >= 0.0f || ((Number) wp1Var.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) wp1Var.invoke()).floatValue() < ((Number) ww3Var.f33801b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m13472r(ww3 ww3Var) {
        wp1 wp1Var = ww3Var.f33800a;
        if (((Number) wp1Var.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) wp1Var.invoke()).floatValue();
        ((Number) ww3Var.f33801b.invoke()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m13473s(ww3 ww3Var) {
        wp1 wp1Var = ww3Var.f33800a;
        if (((Number) wp1Var.invoke()).floatValue() < ((Number) ww3Var.f33801b.invoke()).floatValue()) {
            return true;
        }
        ((Number) wp1Var.invoke()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m13474y(ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC1400zc.m13499x(i, i2, num, null);
    }

    /* JADX INFO: renamed from: A */
    public final void m13475A(int i) {
        C1288wc c1288wc = this.f35972y;
        if (c1288wc != null) {
            i14 i14Var = c1288wc.f33229a;
            if (i != i14Var.f21014f) {
                return;
            }
            if (SystemClock.uptimeMillis() - c1288wc.f33234f <= 1000) {
                AccessibilityEvent accessibilityEventM13487h = m13487h(m13496u(i14Var.f21014f), 131072);
                accessibilityEventM13487h.setFromIndex(c1288wc.f33232d);
                accessibilityEventM13487h.setToIndex(c1288wc.f33233e);
                accessibilityEventM13487h.setAction(c1288wc.f33230b);
                accessibilityEventM13487h.setMovementGranularity(c1288wc.f33231c);
                accessibilityEventM13487h.getText().add(m13470m(i14Var));
                m13498w(accessibilityEventM13487h);
            }
        }
        this.f35972y = null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0285  */
    /* JADX WARN: Code duplicated, block: B:104:0x0299  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:107:0x02be  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:111:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02da  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:130:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:133:0x0309 A[LOOP:4: B:128:0x02f8->B:133:0x0309, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x0317  */
    /* JADX WARN: Code duplicated, block: B:141:0x032b A[LOOP:5: B:136:0x0313->B:141:0x032b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x0351  */
    /* JADX WARN: Code duplicated, block: B:153:0x035c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0385  */
    /* JADX WARN: Code duplicated, block: B:161:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:167:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:169:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:170:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:172:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:182:0x0443  */
    /* JADX WARN: Code duplicated, block: B:211:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:242:0x053a  */
    /* JADX WARN: Code duplicated, block: B:244:0x0547  */
    /* JADX WARN: Code duplicated, block: B:247:0x0554  */
    /* JADX WARN: Code duplicated, block: B:273:0x0618  */
    /* JADX WARN: Code duplicated, block: B:293:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0312 A[EDGE_INSN: B:294:0x0312->B:135:0x0312 BREAK  A[LOOP:4: B:128:0x02f8->B:133:0x0309], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0330 A[EDGE_INSN: B:296:0x0330->B:143:0x0330 BREAK  A[LOOP:5: B:136:0x0313->B:141:0x032b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x012e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0136  */
    /* JADX WARN: Code duplicated, block: B:51:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Code duplicated, block: B:55:0x015f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0169  */
    /* JADX WARN: Code duplicated, block: B:58:0x0180  */
    /* JADX WARN: Code duplicated, block: B:60:0x0188  */
    /* JADX WARN: Code duplicated, block: B:61:0x0198  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x0210  */
    /* JADX WARN: Code duplicated, block: B:84:0x021d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0223  */
    /* JADX WARN: Code duplicated, block: B:88:0x0232  */
    /* JADX WARN: Code duplicated, block: B:91:0x0239  */
    /* JADX WARN: Code duplicated, block: B:92:0x0241  */
    /* JADX WARN: Code duplicated, block: B:94:0x0245  */
    /* JADX WARN: Code duplicated, block: B:96:0x024a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0257  */
    /* JADX INFO: renamed from: B */
    public final void m13476B(m52 m52Var) {
        Integer num;
        Integer num2;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        int i2;
        Integer num3;
        Integer num4;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        e14 e14Var;
        i14 i14Var;
        int i6;
        boolean z;
        boolean z2;
        lw2 lw2Var;
        wf2 wf2Var;
        int i7;
        e14 e14Var2;
        long j;
        wf2 wf2Var2;
        i14 i14Var2;
        int i8;
        int i9;
        boolean z3;
        p14 p14Var;
        int i10;
        p14 p14Var2;
        p14 p14Var3;
        String str;
        Integer num5;
        p14 p14Var4;
        Object objM8132g;
        Object objM8132g2;
        iq1 iq1Var;
        boolean z4;
        int i11;
        Object objM8132g3;
        C0875lk c0875lk;
        String str2;
        Integer num6;
        Object objM8132g4;
        C0875lk c0875lk2;
        Object objM8132g5;
        CharSequence charSequence;
        CharSequence charSequenceM13469J;
        int length;
        int length2;
        Integer num7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zM8128c;
        boolean z5;
        boolean z6;
        Integer num8;
        AccessibilityEvent accessibilityEventM13488i;
        Object objM8132g6;
        lq3 lq3Var;
        Object objM8132g7;
        wf2 wf2Var3;
        AccessibilityEvent accessibilityEventM13487h;
        Object objM8132g8;
        List list;
        String strM13170a;
        Object objM8132g9;
        List list2;
        String strM13170a2;
        String str3;
        boolean zM8128c2;
        int i18;
        m52 m52Var2 = m52Var;
        Integer num9 = 64;
        ArrayList arrayList3 = this.f35949L;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int[] iArr3 = m52Var2.f24666b;
        long[] jArr3 = m52Var2.f24665a;
        int i19 = 2;
        int length3 = jArr3.length - 2;
        int i20 = 0;
        Integer num10 = 0;
        if (length3 < 0) {
            return;
        }
        int i21 = 0;
        while (true) {
            long j2 = jArr3[i21];
            int i22 = i19;
            int i23 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i24 = 8;
                int i25 = 8 - ((~(i21 - i23)) >>> 31);
                long j3 = j2;
                int i26 = i20;
                while (i26 < i25) {
                    if ((j3 & 255) < 128) {
                        int i27 = iArr3[(i21 << 3) + i26];
                        j14 j14Var = (j14) this.f35944G.m8197b(i27);
                        if (j14Var == null) {
                            i2 = i26;
                            num3 = num10;
                            num4 = num9;
                            arrayList2 = arrayList4;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i3 = i24;
                            i4 = i25;
                            i5 = i21;
                        } else {
                            e14 e14Var3 = j14Var.f21955a;
                            lw2 lw2Var2 = e14Var3.f17631a;
                            k14 k14Var = (k14) m52Var2.m8197b(i27);
                            int i28 = i24;
                            i14 i14Var3 = k14Var != null ? k14Var.f22816a : null;
                            if (i14Var3 == null) {
                                throw d55.m4363h("no value for specified key");
                            }
                            wf2 wf2Var4 = i14Var3.f21011c;
                            e14 e14Var4 = i14Var3.f21012d;
                            iArr2 = iArr3;
                            int i29 = i14Var3.f21014f;
                            jArr2 = jArr3;
                            lw2 lw2Var3 = e14Var4.f17631a;
                            i5 = i21;
                            Object[] objArr = lw2Var3.f24419b;
                            Object[] objArr2 = lw2Var3.f24420c;
                            long[] jArr4 = lw2Var3.f24418a;
                            i2 = i26;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                wf2 wf2Var5 = wf2Var4;
                                i4 = i25;
                                int i30 = 0;
                                z = false;
                                while (true) {
                                    long j4 = jArr4[i30];
                                    i14 i14Var4 = i14Var3;
                                    int i31 = i30;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i32 = 8 - ((~(i31 - length4)) >>> 31);
                                        int i33 = 0;
                                        while (i33 < i32) {
                                            if ((j4 & 255) < 128) {
                                                int i34 = (i31 << 3) + i33;
                                                Object obj = objArr[i34];
                                                i9 = length4;
                                                Object obj2 = objArr2[i34];
                                                e14Var2 = e14Var3;
                                                p14 p14Var5 = (p14) obj;
                                                j = j4;
                                                p14 p14Var6 = m14.f24573v;
                                                if (z62.m13387o(p14Var5, p14Var6) || z62.m13387o(p14Var5, m14.f24574w)) {
                                                    sx3 sx3VarM13845I = zy5.m13845I(arrayList4, i27);
                                                    if (sx3VarM13845I != null) {
                                                        z3 = false;
                                                    } else {
                                                        sx3VarM13845I = new sx3();
                                                        sx3VarM13845I.f30634a = i27;
                                                        sx3VarM13845I.f30635b = arrayList3;
                                                        sx3VarM13845I.f30636c = null;
                                                        sx3VarM13845I.f30637d = null;
                                                        sx3VarM13845I.f30638e = null;
                                                        sx3VarM13845I.f30639f = null;
                                                        VarHandle.storeStoreFence();
                                                        z3 = true;
                                                    }
                                                    arrayList3.add(sx3VarM13845I);
                                                } else {
                                                    arrayList4 = arrayList4;
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    p14Var = m14.f24555d;
                                                    if (z62.m13387o(p14Var5, p14Var)) {
                                                        str3 = (String) obj2;
                                                        zM8128c2 = lw2Var2.m8128c(p14Var);
                                                        i18 = i28;
                                                        if (zM8128c2) {
                                                            m13500z(i27, str3, i18);
                                                        }
                                                    } else {
                                                        i10 = i28;
                                                        if (z62.m13387o(p14Var5, m14.f24553b)) {
                                                            m13474y(this, m13496u(i27), 2048, num9, i10);
                                                            m13474y(this, m13496u(i27), 2048, num10, i10);
                                                        } else if (z62.m13387o(p14Var5, m14.f24544K)) {
                                                            m13474y(this, m13496u(i27), 2048, 8192, 8);
                                                            m13474y(this, m13496u(i27), 2048, num10, 8);
                                                        } else if (z62.m13387o(p14Var5, m14.f24547N)) {
                                                            m13474y(this, m13496u(i27), 2048, 3072, 8);
                                                        } else if (z62.m13387o(p14Var5, m14.f24554c)) {
                                                            m13474y(this, m13496u(i27), 2048, num9, 8);
                                                            m13474y(this, m13496u(i27), 2048, num10, 8);
                                                        } else {
                                                            p14Var2 = m14.f24543J;
                                                            if (z62.m13387o(p14Var5, p14Var2)) {
                                                                objM8132g6 = lw2Var3.m8132g(m14.f24576y);
                                                                if (objM8132g6 == null) {
                                                                    objM8132g6 = null;
                                                                }
                                                                lq3Var = (lq3) objM8132g6;
                                                                if (lq3Var == null && lq3Var.f24281a == 4) {
                                                                    objM8132g7 = lw2Var3.m8132g(p14Var2);
                                                                    if (objM8132g7 == null) {
                                                                        objM8132g7 = null;
                                                                    }
                                                                    if (z62.m13387o(objM8132g7, Boolean.TRUE)) {
                                                                        accessibilityEventM13487h = m13487h(m13496u(i27), 4);
                                                                        i14Var2 = i14Var4;
                                                                        wf2 wf2Var6 = wf2Var5;
                                                                        i14 i14Var5 = new i14(i14Var2.f21009a, true, wf2Var6, e14Var4);
                                                                        objM8132g8 = i14Var5.m6549k().f17631a.m8132g(m14.f24552a);
                                                                        if (objM8132g8 == null) {
                                                                            objM8132g8 = null;
                                                                        }
                                                                        list = (List) objM8132g8;
                                                                        wf2Var3 = wf2Var6;
                                                                        if (list != null) {
                                                                            strM13170a = yl2.m13170a(list, ",", null, 62);
                                                                        } else {
                                                                            strM13170a = null;
                                                                        }
                                                                        objM8132g9 = i14Var5.m6549k().f17631a.m8132g(m14.f24535B);
                                                                        if (objM8132g9 == null) {
                                                                            objM8132g9 = null;
                                                                        }
                                                                        list2 = (List) objM8132g9;
                                                                        if (list2 != null) {
                                                                            strM13170a2 = yl2.m13170a(list2, ",", null, 62);
                                                                        } else {
                                                                            strM13170a2 = null;
                                                                        }
                                                                        if (strM13170a != null) {
                                                                            accessibilityEventM13487h.setContentDescription(strM13170a);
                                                                        }
                                                                        if (strM13170a2 != null) {
                                                                            accessibilityEventM13487h.getText().add(strM13170a2);
                                                                        }
                                                                        m13498w(accessibilityEventM13487h);
                                                                    } else {
                                                                        wf2Var3 = wf2Var5;
                                                                        i14Var2 = i14Var4;
                                                                        m13474y(this, m13496u(i27), 2048, num10, 8);
                                                                    }
                                                                } else {
                                                                    wf2Var3 = wf2Var5;
                                                                    i14Var2 = i14Var4;
                                                                    m13474y(this, m13496u(i27), 2048, num9, 8);
                                                                    m13474y(this, m13496u(i27), 2048, num10, 8);
                                                                }
                                                                wf2Var2 = wf2Var3;
                                                            } else {
                                                                i32 = i32;
                                                                i33 = i33;
                                                                wf2Var2 = wf2Var5;
                                                                i14Var2 = i14Var4;
                                                                if (z62.m13387o(p14Var5, m14.f24552a)) {
                                                                    m13499x(m13496u(i27), 2048, 4, (List) obj2);
                                                                } else {
                                                                    p14Var3 = m14.f24539F;
                                                                    str = "";
                                                                    if (z62.m13387o(p14Var5, p14Var3)) {
                                                                        if (lw2Var3.m8128c(d14.f16714k)) {
                                                                            objM8132g4 = lw2Var2.m8132g(p14Var3);
                                                                            if (objM8132g4 == null) {
                                                                                objM8132g4 = null;
                                                                            }
                                                                            c0875lk2 = (C0875lk) objM8132g4;
                                                                            if (c0875lk2 == null) {
                                                                                c0875lk2 = "";
                                                                            }
                                                                            objM8132g5 = lw2Var3.m8132g(p14Var3);
                                                                            if (objM8132g5 == null) {
                                                                                objM8132g5 = null;
                                                                            }
                                                                            charSequence = (C0875lk) objM8132g5;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceM13469J = m13469J(charSequence);
                                                                            length = c0875lk2.length();
                                                                            length2 = charSequence.length();
                                                                            num7 = num10;
                                                                            if (length > length2) {
                                                                                i12 = length2;
                                                                            } else {
                                                                                i12 = length;
                                                                            }
                                                                            num9 = num9;
                                                                            i13 = 0;
                                                                            while (true) {
                                                                                i14 = i12;
                                                                                if (i13 < i12) {
                                                                                    i15 = length;
                                                                                    break;
                                                                                }
                                                                                i15 = length;
                                                                                if (c0875lk2.charAt(i13) != charSequence.charAt(i13)) {
                                                                                    break;
                                                                                }
                                                                                i13++;
                                                                                i12 = i14;
                                                                                length = i15;
                                                                            }
                                                                            i16 = 0;
                                                                            while (true) {
                                                                                if (i16 < i14 - i13) {
                                                                                    i17 = i16;
                                                                                    break;
                                                                                }
                                                                                i17 = i16;
                                                                                if (c0875lk2.charAt((i15 - 1) - i16) != charSequence.charAt((length2 - 1) - i17)) {
                                                                                    break;
                                                                                } else {
                                                                                    i16 = i17 + 1;
                                                                                }
                                                                            }
                                                                            int i35 = (i15 - i17) - i13;
                                                                            int i36 = (length2 - i17) - i13;
                                                                            p14 p14Var7 = m14.f24546M;
                                                                            boolean zM8128c3 = lw2Var2.m8128c(p14Var7);
                                                                            boolean zM8128c4 = lw2Var3.m8128c(p14Var7);
                                                                            zM8128c = lw2Var2.m8128c(m14.f24539F);
                                                                            if (zM8128c || zM8128c3 || !zM8128c4) {
                                                                                z5 = false;
                                                                            } else {
                                                                                z5 = true;
                                                                            }
                                                                            if (zM8128c || !zM8128c3 || zM8128c4) {
                                                                                z6 = false;
                                                                            } else {
                                                                                z6 = true;
                                                                            }
                                                                            if (!z5 || z6) {
                                                                                i8 = i27;
                                                                                num8 = num7;
                                                                                accessibilityEventM13488i = m13488i(m13496u(i27), num8, num7, Integer.valueOf(length2), charSequenceM13469J);
                                                                            } else {
                                                                                accessibilityEventM13488i = m13487h(m13496u(i27), 16);
                                                                                accessibilityEventM13488i.setFromIndex(i13);
                                                                                accessibilityEventM13488i.setRemovedCount(i35);
                                                                                accessibilityEventM13488i.setAddedCount(i36);
                                                                                accessibilityEventM13488i.setBeforeText(c0875lk2);
                                                                                accessibilityEventM13488i.getText().add(charSequenceM13469J);
                                                                                i8 = i27;
                                                                                num8 = num7;
                                                                            }
                                                                            accessibilityEventM13488i.setClassName("android.widget.EditText");
                                                                            if (Build.VERSION.SDK_INT >= 37) {
                                                                                AbstractC1214uc.m11531b(i14Var2, accessibilityEventM13488i);
                                                                            }
                                                                            m13498w(accessibilityEventM13488i);
                                                                            if (!z5 || z6) {
                                                                                num6 = num8;
                                                                                long j5 = ((ql4) e14Var4.m4900c(m14.f24540G)).f28558a;
                                                                                accessibilityEventM13488i.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventM13488i.setToIndex((int) (j5 & 4294967295L));
                                                                                m13498w(accessibilityEventM13488i);
                                                                            } else {
                                                                                num6 = num8;
                                                                            }
                                                                        } else {
                                                                            num6 = num10;
                                                                            lw2Var2 = lw2Var2;
                                                                            num9 = num9;
                                                                            i8 = i27;
                                                                            m13474y(this, m13496u(i8), 2048, Integer.valueOf(i22), 8);
                                                                        }
                                                                        i9 = i9;
                                                                        num10 = num6;
                                                                    } else {
                                                                        num5 = num10;
                                                                        lw2Var2 = lw2Var2;
                                                                        num9 = num9;
                                                                        i8 = i27;
                                                                        p14Var4 = m14.f24540G;
                                                                        if (z62.m13387o(p14Var5, p14Var4)) {
                                                                            objM8132g3 = lw2Var3.m8132g(p14Var3);
                                                                            if (objM8132g3 == null) {
                                                                                objM8132g3 = null;
                                                                            }
                                                                            c0875lk = (C0875lk) objM8132g3;
                                                                            if (c0875lk != null && (str2 = c0875lk.f24092b) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j6 = ((ql4) e14Var4.m4900c(p14Var4)).f28558a;
                                                                            num10 = num5;
                                                                            m13498w(m13488i(m13496u(i8), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), m13469J(str)));
                                                                            m13475A(i29);
                                                                            i9 = i9;
                                                                        } else {
                                                                            i9 = i9;
                                                                            num10 = num5;
                                                                            if (!z62.m13387o(p14Var5, p14Var6) || z62.m13387o(p14Var5, m14.f24574w)) {
                                                                                m13494p(wf2Var2);
                                                                                sx3 sx3VarM13845I2 = zy5.m13845I(arrayList3, i8);
                                                                                objM8132g = lw2Var3.m8132g(p14Var6);
                                                                                if (objM8132g == null) {
                                                                                    objM8132g = null;
                                                                                }
                                                                                sx3VarM13845I2.f30638e = (ww3) objM8132g;
                                                                                objM8132g2 = lw2Var3.m8132g(m14.f24574w);
                                                                                if (objM8132g2 == null) {
                                                                                    objM8132g2 = null;
                                                                                }
                                                                                sx3VarM13845I2.f30639f = (ww3) objM8132g2;
                                                                                m13495t(sx3VarM13845I2);
                                                                            } else if (z62.m13387o(p14Var5, m14.f24563l)) {
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i11 = 8;
                                                                                    m13498w(m13487h(m13496u(i29), 8));
                                                                                } else {
                                                                                    i11 = 8;
                                                                                }
                                                                                m13474y(this, m13496u(i29), 2048, num10, i11);
                                                                            } else {
                                                                                p14 p14Var8 = d14.f16727x;
                                                                                if (z62.m13387o(p14Var5, p14Var8)) {
                                                                                    List list3 = (List) e14Var4.m4900c(p14Var8);
                                                                                    Object objM8132g10 = lw2Var2.m8132g(p14Var8);
                                                                                    if (objM8132g10 == null) {
                                                                                        objM8132g10 = null;
                                                                                    }
                                                                                    List list4 = (List) objM8132g10;
                                                                                    if (list4 != null) {
                                                                                        mw2 mw2Var = uv3.f32207a;
                                                                                        mw2 mw2Var2 = new mw2();
                                                                                        int size = list3.size();
                                                                                        int i37 = 0;
                                                                                        while (i37 < size) {
                                                                                            mw2Var2.m8409a(((fs0) list3.get(i37)).f19247a);
                                                                                            i37++;
                                                                                            list3 = list3;
                                                                                        }
                                                                                        mw2 mw2Var3 = new mw2();
                                                                                        int size2 = list4.size();
                                                                                        int i38 = 0;
                                                                                        while (i38 < size2) {
                                                                                            mw2Var3.m8409a(((fs0) list4.get(i38)).f19247a);
                                                                                            i38++;
                                                                                            list4 = list4;
                                                                                        }
                                                                                        if (z || !mw2Var2.equals(mw2Var3)) {
                                                                                            z4 = true;
                                                                                        } else {
                                                                                            z4 = false;
                                                                                        }
                                                                                    } else if (z || !list3.isEmpty()) {
                                                                                        z4 = true;
                                                                                    } else {
                                                                                        z4 = false;
                                                                                    }
                                                                                    z = z4;
                                                                                } else if (z || !(obj2 instanceof C1353y2)) {
                                                                                    z = true;
                                                                                } else {
                                                                                    C1353y2 c1353y2 = (C1353y2) obj2;
                                                                                    Object objM8132g11 = lw2Var2.m8132g(p14Var5);
                                                                                    if (objM8132g11 == null) {
                                                                                        objM8132g11 = null;
                                                                                    }
                                                                                    if (c1353y2 != objM8132g11) {
                                                                                        if (objM8132g11 instanceof C1353y2) {
                                                                                            String str4 = c1353y2.f34817a;
                                                                                            C1353y2 c1353y3 = (C1353y2) objM8132g11;
                                                                                            iq1 iq1Var2 = c1353y3.f34818b;
                                                                                            if (z62.m13387o(str4, c1353y3.f34817a) && (((iq1Var = c1353y2.f34818b) != null || iq1Var2 == null) && (iq1Var == null || iq1Var2 != null))) {
                                                                                            }
                                                                                        }
                                                                                        z = true;
                                                                                    }
                                                                                    z = false;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i8 = i27;
                                                        }
                                                    }
                                                    num9 = num9;
                                                    i32 = i32;
                                                    i33 = i33;
                                                    wf2Var2 = wf2Var5;
                                                    i14Var2 = i14Var4;
                                                    num10 = num10;
                                                    i8 = i27;
                                                    lw2Var2 = lw2Var2;
                                                    i9 = i9;
                                                } else {
                                                    Object objM8132g12 = lw2Var2.m8132g(p14Var5);
                                                    if (objM8132g12 == null) {
                                                        objM8132g12 = null;
                                                    }
                                                    if (z62.m13387o(obj2, objM8132g12)) {
                                                        num9 = num9;
                                                        i32 = i32;
                                                        i33 = i33;
                                                        wf2Var2 = wf2Var5;
                                                        i14Var2 = i14Var4;
                                                        num10 = num10;
                                                        i8 = i27;
                                                        lw2Var2 = lw2Var2;
                                                        i9 = i9;
                                                    } else {
                                                        p14Var = m14.f24555d;
                                                        if (z62.m13387o(p14Var5, p14Var)) {
                                                            str3 = (String) obj2;
                                                            zM8128c2 = lw2Var2.m8128c(p14Var);
                                                            i18 = i28;
                                                            if (zM8128c2) {
                                                                m13500z(i27, str3, i18);
                                                            }
                                                        } else {
                                                            i10 = i28;
                                                            if (z62.m13387o(p14Var5, m14.f24553b)) {
                                                                m13474y(this, m13496u(i27), 2048, num9, i10);
                                                                m13474y(this, m13496u(i27), 2048, num10, i10);
                                                            } else if (z62.m13387o(p14Var5, m14.f24544K)) {
                                                                m13474y(this, m13496u(i27), 2048, 8192, 8);
                                                                m13474y(this, m13496u(i27), 2048, num10, 8);
                                                            } else if (z62.m13387o(p14Var5, m14.f24547N)) {
                                                                m13474y(this, m13496u(i27), 2048, 3072, 8);
                                                            } else if (z62.m13387o(p14Var5, m14.f24554c)) {
                                                                m13474y(this, m13496u(i27), 2048, num9, 8);
                                                                m13474y(this, m13496u(i27), 2048, num10, 8);
                                                            } else {
                                                                p14Var2 = m14.f24543J;
                                                                if (z62.m13387o(p14Var5, p14Var2)) {
                                                                    objM8132g6 = lw2Var3.m8132g(m14.f24576y);
                                                                    if (objM8132g6 == null) {
                                                                        objM8132g6 = null;
                                                                    }
                                                                    lq3Var = (lq3) objM8132g6;
                                                                    if (lq3Var == null) {
                                                                        wf2Var3 = wf2Var5;
                                                                        i14Var2 = i14Var4;
                                                                        m13474y(this, m13496u(i27), 2048, num9, 8);
                                                                        m13474y(this, m13496u(i27), 2048, num10, 8);
                                                                    } else {
                                                                        objM8132g7 = lw2Var3.m8132g(p14Var2);
                                                                        if (objM8132g7 == null) {
                                                                            objM8132g7 = null;
                                                                        }
                                                                        if (z62.m13387o(objM8132g7, Boolean.TRUE)) {
                                                                            accessibilityEventM13487h = m13487h(m13496u(i27), 4);
                                                                            i14Var2 = i14Var4;
                                                                            wf2 wf2Var7 = wf2Var5;
                                                                            i14 i14Var6 = new i14(i14Var2.f21009a, true, wf2Var7, e14Var4);
                                                                            objM8132g8 = i14Var6.m6549k().f17631a.m8132g(m14.f24552a);
                                                                            if (objM8132g8 == null) {
                                                                                objM8132g8 = null;
                                                                            }
                                                                            list = (List) objM8132g8;
                                                                            wf2Var3 = wf2Var7;
                                                                            if (list != null) {
                                                                                strM13170a = yl2.m13170a(list, ",", null, 62);
                                                                            } else {
                                                                                strM13170a = null;
                                                                            }
                                                                            objM8132g9 = i14Var6.m6549k().f17631a.m8132g(m14.f24535B);
                                                                            if (objM8132g9 == null) {
                                                                                objM8132g9 = null;
                                                                            }
                                                                            list2 = (List) objM8132g9;
                                                                            if (list2 != null) {
                                                                                strM13170a2 = yl2.m13170a(list2, ",", null, 62);
                                                                            } else {
                                                                                strM13170a2 = null;
                                                                            }
                                                                            if (strM13170a != null) {
                                                                                accessibilityEventM13487h.setContentDescription(strM13170a);
                                                                            }
                                                                            if (strM13170a2 != null) {
                                                                                accessibilityEventM13487h.getText().add(strM13170a2);
                                                                            }
                                                                            m13498w(accessibilityEventM13487h);
                                                                        } else {
                                                                            wf2Var3 = wf2Var5;
                                                                            i14Var2 = i14Var4;
                                                                            m13474y(this, m13496u(i27), 2048, num10, 8);
                                                                        }
                                                                    }
                                                                    wf2Var2 = wf2Var3;
                                                                } else {
                                                                    i32 = i32;
                                                                    i33 = i33;
                                                                    wf2Var2 = wf2Var5;
                                                                    i14Var2 = i14Var4;
                                                                    if (z62.m13387o(p14Var5, m14.f24552a)) {
                                                                        m13499x(m13496u(i27), 2048, 4, (List) obj2);
                                                                    } else {
                                                                        p14Var3 = m14.f24539F;
                                                                        str = "";
                                                                        if (z62.m13387o(p14Var5, p14Var3)) {
                                                                            if (lw2Var3.m8128c(d14.f16714k)) {
                                                                                objM8132g4 = lw2Var2.m8132g(p14Var3);
                                                                                if (objM8132g4 == null) {
                                                                                    objM8132g4 = null;
                                                                                }
                                                                                c0875lk2 = (C0875lk) objM8132g4;
                                                                                if (c0875lk2 == null) {
                                                                                    c0875lk2 = "";
                                                                                }
                                                                                objM8132g5 = lw2Var3.m8132g(p14Var3);
                                                                                if (objM8132g5 == null) {
                                                                                    objM8132g5 = null;
                                                                                }
                                                                                charSequence = (C0875lk) objM8132g5;
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceM13469J = m13469J(charSequence);
                                                                                length = c0875lk2.length();
                                                                                length2 = charSequence.length();
                                                                                num7 = num10;
                                                                                if (length > length2) {
                                                                                    i12 = length2;
                                                                                } else {
                                                                                    i12 = length;
                                                                                }
                                                                                num9 = num9;
                                                                                i13 = 0;
                                                                                while (true) {
                                                                                    i14 = i12;
                                                                                    if (i13 < i12) {
                                                                                        i15 = length;
                                                                                        break;
                                                                                    }
                                                                                    i15 = length;
                                                                                    if (c0875lk2.charAt(i13) != charSequence.charAt(i13)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i13++;
                                                                                        i12 = i14;
                                                                                        length = i15;
                                                                                    }
                                                                                }
                                                                                i16 = 0;
                                                                                while (true) {
                                                                                    if (i16 < i14 - i13) {
                                                                                        i17 = i16;
                                                                                        break;
                                                                                    }
                                                                                    i17 = i16;
                                                                                    if (c0875lk2.charAt((i15 - 1) - i16) != charSequence.charAt((length2 - 1) - i17)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i16 = i17 + 1;
                                                                                }
                                                                                int i39 = (i15 - i17) - i13;
                                                                                int i310 = (length2 - i17) - i13;
                                                                                p14 p14Var9 = m14.f24546M;
                                                                                boolean zM8128c5 = lw2Var2.m8128c(p14Var9);
                                                                                boolean zM8128c6 = lw2Var3.m8128c(p14Var9);
                                                                                zM8128c = lw2Var2.m8128c(m14.f24539F);
                                                                                if (zM8128c) {
                                                                                    z5 = false;
                                                                                } else {
                                                                                    z5 = false;
                                                                                }
                                                                                if (zM8128c) {
                                                                                    z6 = false;
                                                                                } else {
                                                                                    z6 = false;
                                                                                }
                                                                                if (z5) {
                                                                                    i8 = i27;
                                                                                    num8 = num7;
                                                                                    accessibilityEventM13488i = m13488i(m13496u(i27), num8, num7, Integer.valueOf(length2), charSequenceM13469J);
                                                                                } else {
                                                                                    i8 = i27;
                                                                                    num8 = num7;
                                                                                    accessibilityEventM13488i = m13488i(m13496u(i27), num8, num7, Integer.valueOf(length2), charSequenceM13469J);
                                                                                }
                                                                                accessibilityEventM13488i.setClassName("android.widget.EditText");
                                                                                if (Build.VERSION.SDK_INT >= 37) {
                                                                                    AbstractC1214uc.m11531b(i14Var2, accessibilityEventM13488i);
                                                                                }
                                                                                m13498w(accessibilityEventM13488i);
                                                                                if (z5) {
                                                                                    num6 = num8;
                                                                                    long j7 = ((ql4) e14Var4.m4900c(m14.f24540G)).f28558a;
                                                                                    accessibilityEventM13488i.setFromIndex((int) (j7 >> 32));
                                                                                    accessibilityEventM13488i.setToIndex((int) (j7 & 4294967295L));
                                                                                    m13498w(accessibilityEventM13488i);
                                                                                } else {
                                                                                    num6 = num8;
                                                                                    long j8 = ((ql4) e14Var4.m4900c(m14.f24540G)).f28558a;
                                                                                    accessibilityEventM13488i.setFromIndex((int) (j8 >> 32));
                                                                                    accessibilityEventM13488i.setToIndex((int) (j8 & 4294967295L));
                                                                                    m13498w(accessibilityEventM13488i);
                                                                                }
                                                                            } else {
                                                                                num6 = num10;
                                                                                lw2Var2 = lw2Var2;
                                                                                num9 = num9;
                                                                                i8 = i27;
                                                                                m13474y(this, m13496u(i8), 2048, Integer.valueOf(i22), 8);
                                                                            }
                                                                            i9 = i9;
                                                                            num10 = num6;
                                                                        } else {
                                                                            num5 = num10;
                                                                            lw2Var2 = lw2Var2;
                                                                            num9 = num9;
                                                                            i8 = i27;
                                                                            p14Var4 = m14.f24540G;
                                                                            if (z62.m13387o(p14Var5, p14Var4)) {
                                                                                objM8132g3 = lw2Var3.m8132g(p14Var3);
                                                                                if (objM8132g3 == null) {
                                                                                    objM8132g3 = null;
                                                                                }
                                                                                c0875lk = (C0875lk) objM8132g3;
                                                                                if (c0875lk != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j9 = ((ql4) e14Var4.m4900c(p14Var4)).f28558a;
                                                                                num10 = num5;
                                                                                m13498w(m13488i(m13496u(i8), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), m13469J(str)));
                                                                                m13475A(i29);
                                                                                i9 = i9;
                                                                            } else {
                                                                                i9 = i9;
                                                                                num10 = num5;
                                                                                if (z62.m13387o(p14Var5, p14Var6)) {
                                                                                    m13494p(wf2Var2);
                                                                                    sx3 sx3VarM13845I3 = zy5.m13845I(arrayList3, i8);
                                                                                    objM8132g = lw2Var3.m8132g(p14Var6);
                                                                                    if (objM8132g == null) {
                                                                                        objM8132g = null;
                                                                                    }
                                                                                    sx3VarM13845I3.f30638e = (ww3) objM8132g;
                                                                                    objM8132g2 = lw2Var3.m8132g(m14.f24574w);
                                                                                    if (objM8132g2 == null) {
                                                                                        objM8132g2 = null;
                                                                                    }
                                                                                    sx3VarM13845I3.f30639f = (ww3) objM8132g2;
                                                                                    m13495t(sx3VarM13845I3);
                                                                                } else {
                                                                                    m13494p(wf2Var2);
                                                                                    sx3 sx3VarM13845I4 = zy5.m13845I(arrayList3, i8);
                                                                                    objM8132g = lw2Var3.m8132g(p14Var6);
                                                                                    if (objM8132g == null) {
                                                                                        objM8132g = null;
                                                                                    }
                                                                                    sx3VarM13845I4.f30638e = (ww3) objM8132g;
                                                                                    objM8132g2 = lw2Var3.m8132g(m14.f24574w);
                                                                                    if (objM8132g2 == null) {
                                                                                        objM8132g2 = null;
                                                                                    }
                                                                                    sx3VarM13845I4.f30639f = (ww3) objM8132g2;
                                                                                    m13495t(sx3VarM13845I4);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i8 = i27;
                                                            }
                                                        }
                                                        num9 = num9;
                                                        i32 = i32;
                                                        i33 = i33;
                                                        wf2Var2 = wf2Var5;
                                                        i14Var2 = i14Var4;
                                                        num10 = num10;
                                                        i8 = i27;
                                                        lw2Var2 = lw2Var2;
                                                        i9 = i9;
                                                    }
                                                }
                                            } else {
                                                e14Var2 = e14Var3;
                                                num9 = num9;
                                                arrayList4 = arrayList4;
                                                j = j4;
                                                i32 = i32;
                                                i33 = i33;
                                                wf2Var2 = wf2Var5;
                                                i14Var2 = i14Var4;
                                                num10 = num10;
                                                i8 = i27;
                                                lw2Var2 = lw2Var2;
                                                i9 = length4;
                                            }
                                            i28 = 8;
                                            i27 = i8;
                                            i14Var4 = i14Var2;
                                            wf2Var5 = wf2Var2;
                                            lw2Var2 = lw2Var2;
                                            e14Var3 = e14Var2;
                                            arrayList4 = arrayList4;
                                            j4 = j >> 8;
                                            num9 = num9;
                                            i33++;
                                            length4 = i9;
                                            num10 = num10;
                                            i32 = i32;
                                        }
                                        e14Var = e14Var3;
                                        lw2Var = lw2Var2;
                                        num4 = num9;
                                        arrayList2 = arrayList4;
                                        int i40 = i32;
                                        wf2Var = wf2Var5;
                                        i14Var = i14Var4;
                                        num3 = num10;
                                        i6 = i27;
                                        i7 = length4;
                                        if (i40 != i28) {
                                            break;
                                        }
                                    } else {
                                        num3 = num10;
                                        e14Var = e14Var3;
                                        lw2Var = lw2Var2;
                                        num4 = num9;
                                        arrayList2 = arrayList4;
                                        wf2Var = wf2Var5;
                                        i14Var = i14Var4;
                                        i7 = length4;
                                        i6 = i27;
                                    }
                                    if (i31 == i7) {
                                        break;
                                    }
                                    i27 = i6;
                                    wf2Var5 = wf2Var;
                                    lw2Var2 = lw2Var;
                                    e14Var3 = e14Var;
                                    num9 = num4;
                                    i28 = 8;
                                    i30 = i31 + 1;
                                    length4 = i7;
                                    num10 = num3;
                                    i14Var3 = i14Var;
                                    arrayList4 = arrayList2;
                                }
                            } else {
                                e14Var = e14Var3;
                                num4 = num9;
                                arrayList2 = arrayList4;
                                i4 = i25;
                                i14Var = i14Var3;
                                num3 = num10;
                                i6 = i27;
                                z = false;
                            }
                            if (!z) {
                                Iterator it = e14Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z2 = false;
                                        break;
                                    }
                                    if (!i14Var.m6549k().f17631a.m8128c((p14) ((Map.Entry) it.next()).getKey())) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                z = z2;
                            }
                            if (z) {
                                i3 = 8;
                                m13474y(this, m13496u(i6), 2048, num3, 8);
                            } else {
                                i3 = 8;
                            }
                        }
                    } else {
                        i2 = i26;
                        num3 = num10;
                        num4 = num9;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i3 = i24;
                        i4 = i25;
                        i5 = i21;
                    }
                    j3 >>= i3;
                    i26 = i2 + 1;
                    m52Var2 = m52Var;
                    i24 = i3;
                    num10 = num3;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i21 = i5;
                    i25 = i4;
                    arrayList4 = arrayList2;
                    num9 = num4;
                }
                num = num10;
                num2 = num9;
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                int i41 = i21;
                if (i25 != i24) {
                    return;
                } else {
                    i = i41;
                }
            } else {
                num = num10;
                num2 = num9;
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                i = i21;
            }
            if (i == i23) {
                return;
            }
            i21 = i + 1;
            m52Var2 = m52Var;
            length3 = i23;
            num10 = num;
            i19 = i22;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList4 = arrayList;
            num9 = num2;
            i20 = 0;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m13477C(wf2 wf2Var, mv2 mv2Var) {
        e14 e14VarM12297x;
        if (wf2Var.m12256J() && !this.f35951d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(wf2Var)) {
            wf2 wf2Var2 = null;
            if (!wf2Var.f33299G.m8671i(8)) {
                wf2Var = wf2Var.m12295v();
                while (true) {
                    if (wf2Var == null) {
                        wf2Var = null;
                        break;
                    } else if (wf2Var.f33299G.m8671i(8)) {
                        break;
                    } else {
                        wf2Var = wf2Var.m12295v();
                    }
                }
            }
            if (wf2Var == null || (e14VarM12297x = wf2Var.m12297x()) == null) {
                return;
            }
            if (!e14VarM12297x.f17633c) {
                for (wf2 wf2VarM12295v = wf2Var.m12295v(); wf2VarM12295v != null; wf2VarM12295v = wf2VarM12295v.m12295v()) {
                    e14 e14VarM12297x2 = wf2VarM12295v.m12297x();
                    if (e14VarM12297x2 != null && e14VarM12297x2.f17633c) {
                        wf2Var2 = wf2VarM12295v;
                        break;
                    }
                }
                if (wf2Var2 != null) {
                    wf2Var = wf2Var2;
                }
            }
            int i = wf2Var.f33312b;
            if (mv2Var.m8403a(i)) {
                m13474y(this, m13496u(i), 2048, 1, 8);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m13478D(wf2 wf2Var) {
        if (wf2Var.m12256J() && !this.f35951d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(wf2Var)) {
            int i = wf2Var.f33312b;
            ww3 ww3Var = (ww3) this.f35963p.m8197b(i);
            ww3 ww3Var2 = (ww3) this.f35964q.m8197b(i);
            if (ww3Var == null && ww3Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM13487h = m13487h(i, 4096);
            if (ww3Var != null) {
                accessibilityEventM13487h.setScrollX((int) ((Number) ww3Var.f33800a.invoke()).floatValue());
                accessibilityEventM13487h.setMaxScrollX((int) ((Number) ww3Var.f33801b.invoke()).floatValue());
            }
            if (ww3Var2 != null) {
                accessibilityEventM13487h.setScrollY((int) ((Number) ww3Var2.f33800a.invoke()).floatValue());
                accessibilityEventM13487h.setMaxScrollY((int) ((Number) ww3Var2.f33801b.invoke()).floatValue());
            }
            m13498w(accessibilityEventM13487h);
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m13479E(i14 i14Var, int i, int i2, boolean z) {
        String strM13470m;
        e14 e14Var = i14Var.f21012d;
        int i3 = i14Var.f21014f;
        p14 p14Var = d14.f16713j;
        if (e14Var.f17631a.m8128c(p14Var) && vd6.m11857p(i14Var)) {
            nq1 nq1Var = (nq1) ((C1353y2) i14Var.f21012d.m4900c(p14Var)).f34818b;
            if (nq1Var != null) {
                return ((Boolean) nq1Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f35967t) && (strM13470m = m13470m(i14Var)) != null) {
            if (i < 0 || i != i2 || i2 > strM13470m.length()) {
                i = -1;
            }
            this.f35967t = i;
            boolean z2 = strM13470m.length() > 0;
            m13498w(m13488i(m13496u(i3), z2 ? Integer.valueOf(this.f35967t) : null, z2 ? Integer.valueOf(this.f35967t) : null, z2 ? Integer.valueOf(strM13470m.length()) : null, strM13470m));
            m13475A(i3);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final Rect m13480G(float f, float f2, float f3, float f4) {
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f35951d;
        long jM10618r = viewTreeObserverOnGlobalLayoutListenerC1140sc.m10618r((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        long jM10618r2 = viewTreeObserverOnGlobalLayoutListenerC1140sc.m10618r((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jM10618r >> 32);
        int i2 = (int) (jM10618r2 >> 32);
        int i3 = (int) (jM10618r & 4294967295L);
        int i4 = (int) (jM10618r2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final void m13481K() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        j14 j14Var;
        lv2 lv2Var = this.f35944G;
        mv2 mv2Var = new mv2();
        mv2 mv2Var2 = this.f35938A;
        int[] iArr = mv2Var2.f25232b;
        long[] jArr3 = mv2Var2.f25231a;
        int length = jArr3.length - 2;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            k14 k14Var = (k14) m13491l().m8197b(i6);
                            Object obj = null;
                            i14 i14Var = k14Var != null ? k14Var.f22816a : null;
                            if (i14Var != null) {
                                if (!i14Var.f21012d.f17631a.m8128c(m14.f24555d)) {
                                    mv2Var.m8403a(i6);
                                    j14Var = (j14) lv2Var.m8197b(i6);
                                    if (j14Var != null) {
                                        Object objM8132g = j14Var.f21955a.f17631a.m8132g(m14.f24555d);
                                        obj = (String) (objM8132g != null ? objM8132g : null);
                                    }
                                    m13500z(i6, obj, 32);
                                }
                            } else {
                                mv2Var.m8403a(i6);
                                j14Var = (j14) lv2Var.m8197b(i6);
                                if (j14Var != null) {
                                    Object objM8132g2 = j14Var.f21955a.f17631a.m8132g(m14.f24555d);
                                    obj = (String) (objM8132g2 != null ? objM8132g2 : null);
                                }
                                m13500z(i6, obj, 32);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = mv2Var.f25232b;
        long[] jArr4 = mv2Var.f25231a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = mv2Var2.f25233c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = mv2Var2.f25231a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (mv2Var2.f25232b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                mv2Var2.m8408f(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        lv2Var.m8116c();
        m52 m52VarM13491l = m13491l();
        int[] iArr3 = m52VarM13491l.f24666b;
        Object[] objArr = m52VarM13491l.f24667c;
        long[] jArr6 = m52VarM13491l.f24665a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            i14 i14Var2 = ((k14) objArr[i25]).f22816a;
                            e14 e14Var = i14Var2.f21012d;
                            p14 p14Var = m14.f24555d;
                            if (e14Var.f17631a.m8128c(p14Var) && mv2Var2.m8403a(i26)) {
                                m13500z(i26, (String) i14Var2.f21012d.m4900c(p14Var), 16);
                            }
                            lv2Var.m8121h(i26, new j14(i14Var2, m13491l()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.f35945H = new j14(this.f35951d.getSemanticsOwner().m7810a(), m13491l());
    }

    @Override // p000.AbstractC0513c3
    /* JADX INFO: renamed from: a */
    public final ar3 mo3837a(View view) {
        return this.f35957j;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX INFO: renamed from: c */
    public final void m13482c(int i, C1242v3 c1242v3, String str, Bundle bundle) {
        i14 i14Var;
        RectF[] rectFArr;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f35951d;
        AccessibilityNodeInfo accessibilityNodeInfo = c1242v3.f32353a;
        k14 k14Var = (k14) m13491l().m8197b(i);
        if (k14Var == null || (i14Var = k14Var.f22816a) == null) {
            return;
        }
        wf2 wf2Var = i14Var.f21011c;
        e14 e14Var = i14Var.f21012d;
        lw2 lw2Var = e14Var.f17631a;
        String strM13470m = m13470m(i14Var);
        if (z62.m13387o(str, this.f35941D)) {
            int iM7293d = this.f35939B.m7293d(i);
            if (iM7293d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM7293d);
                return;
            }
            return;
        }
        if (z62.m13387o(str, this.f35942E)) {
            int iM7293d2 = this.f35940C.m7293d(i);
            if (iM7293d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM7293d2);
                return;
            }
            return;
        }
        if (lw2Var.m8128c(d14.f16704a) && bundle != null && z62.m13387o(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strM13470m != null ? strM13470m.length() : Integer.MAX_VALUE)) {
                    jl4 jl4VarM13849M = zy5.m13849M(e14Var);
                    if (jl4VarM13849M == null) {
                        rectFArr = null;
                    } else {
                        w32 w32Var = (w32) wf2Var.f33299G.f25607d;
                        if (!w32Var.f33059e0.f25208n) {
                            w32Var = null;
                        }
                        if (w32Var != null) {
                            long jMo4005S = w32Var.mo4005S(0L);
                            jl3 jl3VarM6546g = i14Var.m6546g();
                            RectF[] rectFArr2 = new RectF[i3];
                            int i4 = 0;
                            while (i4 < i3) {
                                int i5 = i2 + i4;
                                if (i5 < jl4VarM13849M.f22400a.f21533a.f24092b.length()) {
                                    jl3 jl3VarM7174j = jl4VarM13849M.m7176b(i5).m7174j(jMo4005S);
                                    jl3 jl3VarM7170f = jl3VarM7174j.m7172h(jl3VarM6546g) ? jl3VarM7174j.m7170f(jl3VarM6546g) : null;
                                    if (jl3VarM7170f != null) {
                                        long jM10618r = viewTreeObserverOnGlobalLayoutListenerC1140sc.m10618r((((long) Float.floatToRawIntBits(jl3VarM7170f.f22396a)) << 32) | (((long) Float.floatToRawIntBits(jl3VarM7170f.f22397b)) & 4294967295L));
                                        long jM10618r2 = viewTreeObserverOnGlobalLayoutListenerC1140sc.m10618r((((long) Float.floatToRawIntBits(jl3VarM7170f.f22399d)) & 4294967295L) | (((long) Float.floatToRawIntBits(jl3VarM7170f.f22398c)) << 32));
                                        int i6 = (int) (jM10618r >> 32);
                                        int i7 = (int) (jM10618r2 >> 32);
                                        int i8 = (int) (jM10618r & 4294967295L);
                                        int i9 = (int) (jM10618r2 & 4294967295L);
                                        rectFArr2[i4] = new RectF(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)));
                                    }
                                }
                                i4++;
                                i2 = i2;
                                i3 = i3;
                                jl4VarM13849M = jl4VarM13849M;
                                viewTreeObserverOnGlobalLayoutListenerC1140sc = viewTreeObserverOnGlobalLayoutListenerC1140sc;
                            }
                            rectFArr = rectFArr2;
                        } else {
                            rectFArr = null;
                        }
                    }
                    if (rectFArr == null) {
                        return;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        p14 p14Var = m14.f24577z;
        if (lw2Var.m8128c(p14Var) && bundle != null && z62.m13387o(str, "androidx.compose.ui.semantics.testTag")) {
            Object objM8132g = lw2Var.m8132g(p14Var);
            String str2 = (String) (objM8132g == null ? null : objM8132g);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (z62.m13387o(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, i14Var.f21014f);
            return;
        }
        if (z62.m13387o(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objM8132g2 = lw2Var.m8132g(m14.f24551R);
            p44 p44Var = (p44) (objM8132g2 == null ? null : objM8132g2);
            if (p44Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                jl3 jl3VarM13492n = m13492n(i14Var, rect, p44Var);
                float f = jl3VarM13492n.f22397b;
                float f2 = jl3VarM13492n.f22396a;
                lb5 lb5VarMo5797a = p44Var.mo5797a(jl3VarM13492n.m7168d(), wf2Var.f33293A, viewTreeObserverOnGlobalLayoutListenerC1140sc.getDensity());
                if (lb5VarMo5797a instanceof h63) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m13466F(lb5VarMo5797a, f2, f));
                    return;
                } else if (lb5VarMo5797a instanceof i63) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m13466F(lb5VarMo5797a, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m13467H(lb5VarMo5797a));
                    return;
                } else if (!(lb5VarMo5797a instanceof g63)) {
                    C0670g.m5864c();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m13468I(lb5VarMo5797a, f2, f));
                    return;
                }
            }
            return;
        }
        if (z62.m13387o(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objM8132g3 = lw2Var.m8132g(m14.f24551R);
            p44 p44Var2 = (p44) (objM8132g3 == null ? null : objM8132g3);
            if (p44Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                jl3 jl3VarM13492n2 = m13492n(i14Var, rect2, p44Var2);
                Rect rectM13466F = m13466F(p44Var2.mo5797a(jl3VarM13492n2.m7168d(), wf2Var.f33293A, viewTreeObserverOnGlobalLayoutListenerC1140sc.getDensity()), jl3VarM13492n2.f22396a, jl3VarM13492n2.f22397b);
                if (rectM13466F != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM13466F);
                    return;
                }
                return;
            }
            return;
        }
        if (z62.m13387o(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objM8132g4 = lw2Var.m8132g(m14.f24551R);
            p44 p44Var3 = (p44) (objM8132g4 == null ? null : objM8132g4);
            if (p44Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrM13467H = m13467H(p44Var3.mo5797a(m13492n(i14Var, rect3, p44Var3).m7168d(), wf2Var.f33293A, viewTreeObserverOnGlobalLayoutListenerC1140sc.getDensity()));
                if (fArrM13467H != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM13467H);
                    return;
                }
                return;
            }
            return;
        }
        if (z62.m13387o(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objM8132g5 = lw2Var.m8132g(m14.f24551R);
            p44 p44Var4 = (p44) (objM8132g5 == null ? null : objM8132g5);
            if (p44Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                jl3 jl3VarM13492n3 = m13492n(i14Var, rect4, p44Var4);
                Region regionM13468I = m13468I(p44Var4.mo5797a(jl3VarM13492n3.m7168d(), wf2Var.f33293A, viewTreeObserverOnGlobalLayoutListenerC1140sc.getDensity()), jl3VarM13492n3.f22396a, jl3VarM13492n3.f22397b);
                if (regionM13468I != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM13468I);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Rect m13483d(k14 k14Var) {
        s52 s52Var = k14Var.f22817b;
        return m13480G(s52Var.f29916a, s52Var.f29917b, s52Var.f29918c, s52Var.f29919d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x0057, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:42:0x00c4, B:45:0x00d3, B:50:0x00e3, B:47:0x00de, B:48:0x00e1, B:20:0x0045, B:23:0x004c, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:40:0x009d, B:41:0x00b9), top: B:60:0x0026, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x0057, B:28:0x0068, B:30:0x0070, B:32:0x0079, B:42:0x00c4, B:45:0x00d3, B:50:0x00e3, B:47:0x00de, B:48:0x00e1, B:20:0x0045, B:23:0x004c, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:40:0x009d, B:41:0x00b9), top: B:60:0x0026, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: all -> 0x0093, LOOP:0: B:34:0x0082->B:35:0x0084, LOOP_END, TryCatch #0 {all -> 0x0093, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x0095, B:40:0x009d, B:41:0x00b9), top: B:58:0x007e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x009d A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x0095, B:40:0x009d, B:41:0x00b9), top: B:58:0x007e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fd, code lost:
    
        if (p000.d24.m4317r(r6, r3) == r4) goto L52;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00fd -> B:53:0x0100). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13484e(ym0 ym0Var) {
        C1326xc c1326xc;
        mv2 mv2Var;
        z30 it;
        mv2 mv2Var2;
        int i;
        char c;
        int i2;
        int i3;
        long[] jArr;
        Object objM13297b;
        C0879lo c0879lo = this.f35969v;
        if (ym0Var instanceof C1326xc) {
            c1326xc = (C1326xc) ym0Var;
            int i4 = c1326xc.f34146x;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1326xc.f34146x = i4 - Integer.MIN_VALUE;
            } else {
                c1326xc = new C1326xc(this, ym0Var);
            }
        } else {
            c1326xc = new C1326xc(this, ym0Var);
        }
        Object obj = c1326xc.f34144v;
        ap0 ap0Var = ap0.f14763a;
        int i5 = c1326xc.f34146x;
        int i6 = 1;
        try {
            if (i5 == 0) {
                k43.m7376J(obj);
                mv2Var = new mv2();
                it = this.f35970w.iterator();
                c1326xc.f34142t = mv2Var;
                c1326xc.f34143u = it;
                c1326xc.f34146x = i6;
                objM13297b = it.m13297b(c1326xc);
                if (objM13297b == ap0Var) {
                    mv2Var2 = mv2Var;
                    obj = objM13297b;
                    if (!((Boolean) obj).booleanValue()) {
                        c0879lo.clear();
                        return ju4.f22634a;
                    }
                    it.m13298c();
                    if (m13493o()) {
                        Trace.beginSection("Compose:semantics:boundUpdates");
                        i2 = c0879lo.f24219c;
                        for (i3 = 0; i3 < i2; i3++) {
                            wf2 wf2Var = (wf2) c0879lo.f24218b[i3];
                            m13477C(wf2Var, mv2Var2);
                            m13478D(wf2Var);
                        }
                        mv2Var2.f25234d = 0;
                        jArr = mv2Var2.f25231a;
                        if (jArr != tv3.f31472a) {
                            AbstractC0990oo.m9208c0(jArr, -9187201950435737472L);
                            long[] jArr2 = mv2Var2.f25231a;
                            int i7 = mv2Var2.f25233c;
                            int i8 = i7 >> 3;
                            long j = 255 << ((i7 & 7) << 3);
                            jArr2[i8] = ((~j) & jArr2[i8]) | j;
                        }
                        mv2Var2.f25235e = tv3.m11184a(mv2Var2.f25233c) - mv2Var2.f25234d;
                        Trace.endSection();
                        Handler handler = this.f35951d.getHandler();
                        if (this.f35946I) {
                            i = 1;
                        } else {
                            i = 1;
                        }
                    } else {
                        i = i6;
                    }
                    c0879lo.clear();
                    this.f35963p.m8116c();
                    this.f35964q.m8116c();
                    long j2 = this.f35955h;
                    c1326xc.f34142t = mv2Var2;
                    c1326xc.f34143u = it;
                    c = 2;
                    c1326xc.f34146x = 2;
                }
                return ap0Var;
            }
            if (i5 == 1) {
                it = c1326xc.f34143u;
                mv2Var2 = c1326xc.f34142t;
                k43.m7376J(obj);
                if (!((Boolean) obj).booleanValue()) {
                    c0879lo.clear();
                    return ju4.f22634a;
                }
                it.m13298c();
                if (m13493o()) {
                    try {
                        Trace.beginSection("Compose:semantics:boundUpdates");
                        i2 = c0879lo.f24219c;
                        while (i3 < i2) {
                            wf2 wf2Var2 = (wf2) c0879lo.f24218b[i3];
                            m13477C(wf2Var2, mv2Var2);
                            m13478D(wf2Var2);
                        }
                        mv2Var2.f25234d = 0;
                        jArr = mv2Var2.f25231a;
                        if (jArr != tv3.f31472a) {
                            AbstractC0990oo.m9208c0(jArr, -9187201950435737472L);
                            long[] jArr3 = mv2Var2.f25231a;
                            int i9 = mv2Var2.f25233c;
                            int i10 = i9 >> 3;
                            long j3 = 255 << ((i9 & 7) << 3);
                            jArr3[i10] = ((~j3) & jArr3[i10]) | j3;
                        }
                        mv2Var2.f25235e = tv3.m11184a(mv2Var2.f25233c) - mv2Var2.f25234d;
                        Trace.endSection();
                        Handler handler2 = this.f35951d.getHandler();
                        if (this.f35946I || handler2 == null) {
                            i = 1;
                        } else {
                            i = 1;
                            this.f35946I = true;
                            handler2.post(this.f35948K);
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    i = i6;
                }
                c0879lo.clear();
                this.f35963p.m8116c();
                this.f35964q.m8116c();
                long j4 = this.f35955h;
                c1326xc.f34142t = mv2Var2;
                c1326xc.f34143u = it;
                c = 2;
                c1326xc.f34146x = 2;
            } else {
                if (i5 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = c1326xc.f34143u;
                mv2Var2 = c1326xc.f34142t;
                k43.m7376J(obj);
                c = 2;
                i = 1;
            }
            mv2Var = mv2Var2;
            i6 = i;
            c1326xc.f34142t = mv2Var;
            c1326xc.f34143u = it;
            c1326xc.f34146x = i6;
            objM13297b = it.m13297b(c1326xc);
            if (objM13297b == ap0Var) {
                mv2Var2 = mv2Var;
                obj = objM13297b;
                if (!((Boolean) obj).booleanValue()) {
                    c0879lo.clear();
                    return ju4.f22634a;
                }
                it.m13298c();
                if (m13493o()) {
                    Trace.beginSection("Compose:semantics:boundUpdates");
                    i2 = c0879lo.f24219c;
                    while (i3 < i2) {
                        wf2 wf2Var3 = (wf2) c0879lo.f24218b[i3];
                        m13477C(wf2Var3, mv2Var2);
                        m13478D(wf2Var3);
                    }
                    mv2Var2.f25234d = 0;
                    jArr = mv2Var2.f25231a;
                    if (jArr != tv3.f31472a) {
                        AbstractC0990oo.m9208c0(jArr, -9187201950435737472L);
                        long[] jArr4 = mv2Var2.f25231a;
                        int i11 = mv2Var2.f25233c;
                        int i12 = i11 >> 3;
                        long j5 = 255 << ((i11 & 7) << 3);
                        jArr4[i12] = ((~j5) & jArr4[i12]) | j5;
                    }
                    mv2Var2.f25235e = tv3.m11184a(mv2Var2.f25233c) - mv2Var2.f25234d;
                    Trace.endSection();
                    Handler handler3 = this.f35951d.getHandler();
                    if (this.f35946I) {
                        i = 1;
                    } else {
                        i = 1;
                    }
                } else {
                    i = i6;
                }
                c0879lo.clear();
                this.f35963p.m8116c();
                this.f35964q.m8116c();
                long j6 = this.f35955h;
                c1326xc.f34142t = mv2Var2;
                c1326xc.f34143u = it;
                c = 2;
                c1326xc.f34146x = 2;
            }
            return ap0Var;
        } catch (Throwable th2) {
            c0879lo.clear();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX INFO: renamed from: f */
    public final boolean m13485f(int i, long j, boolean z) {
        p14 p14Var;
        int i2;
        if (z62.m13387o(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            m52 m52VarM13491l = m13491l();
            if (!b33.m3425c(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    p14Var = m14.f24574w;
                } else {
                    if (z) {
                        C0670g.m5864c();
                        return false;
                    }
                    p14Var = m14.f24573v;
                }
                Object[] objArr = m52VarM13491l.f24667c;
                long[] jArr = m52VarM13491l.f24665a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    k14 k14Var = (k14) objArr[(i3 << 3) + i6];
                                    s52 s52Var = k14Var.f22817b;
                                    float f = s52Var.f29916a;
                                    i2 = i4;
                                    float f2 = s52Var.f29917b;
                                    float f3 = s52Var.f29918c;
                                    float f4 = s52Var.f29919d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objM8132g = k14Var.f22816a.f21012d.f17631a.m8132g(p14Var);
                                        if (objM8132g == null) {
                                            objM8132g = null;
                                        }
                                        ww3 ww3Var = (ww3) objM8132g;
                                        if (ww3Var != null) {
                                            wp1 wp1Var = ww3Var.f33800a;
                                            if (i < 0) {
                                                if (((Number) wp1Var.invoke()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) wp1Var.invoke()).floatValue() < ((Number) ww3Var.f33801b.invoke()).floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m13486g() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m13493o()) {
                m13497v(this.f35951d.getSemanticsOwner().m7810a(), this.f35945H);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                m13476B(m13491l());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    m13481K();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final AccessibilityEvent m13487h(int i, int i2) {
        k14 k14Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f35951d;
        accessibilityEventObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC1140sc.getContext().getPackageName());
        accessibilityEventObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC1140sc, i);
        if (m13493o() && (k14Var = (k14) m13491l().m8197b(i)) != null) {
            i14 i14Var = k14Var.f22816a;
            accessibilityEventObtain.setPassword(i14Var.f21012d.f17631a.m8128c(m14.f24546M));
            Object objM8132g = i14Var.f21012d.f17631a.m8132g(m14.f24566o);
            if (objM8132g == null) {
                objM8132g = null;
            }
            boolean zM13387o = z62.m13387o(objM8132g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0561d3.m4334h(accessibilityEventObtain, zM13387o);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: i */
    public final AccessibilityEvent m13488i(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM13487h = m13487h(i, 8192);
        if (num != null) {
            accessibilityEventM13487h.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM13487h.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM13487h.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM13487h.getText().add(charSequence);
        }
        return accessibilityEventM13487h;
    }

    /* JADX INFO: renamed from: j */
    public final int m13489j(i14 i14Var) {
        e14 e14Var = i14Var.f21012d;
        if (!e14Var.f17631a.m8128c(m14.f24552a)) {
            p14 p14Var = m14.f24540G;
            if (e14Var.f17631a.m8128c(p14Var)) {
                return (int) (((ql4) e14Var.m4900c(p14Var)).f28558a & 4294967295L);
            }
        }
        return this.f35967t;
    }

    /* JADX INFO: renamed from: k */
    public final int m13490k(i14 i14Var) {
        e14 e14Var = i14Var.f21012d;
        if (!e14Var.f17631a.m8128c(m14.f24552a)) {
            p14 p14Var = m14.f24540G;
            if (e14Var.f17631a.m8128c(p14Var)) {
                return (int) (((ql4) e14Var.m4900c(p14Var)).f28558a >> 32);
            }
        }
        return this.f35967t;
    }

    /* JADX INFO: renamed from: l */
    public final m52 m13491l() {
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f35951d;
        if (this.f35971x) {
            this.f35971x = false;
            this.f35973z = C0006a5.m79q(viewTreeObserverOnGlobalLayoutListenerC1140sc.getSemanticsOwner(), new C0891m((byte) 11));
            if (m13493o()) {
                lv2 lv2Var = this.f35973z;
                jv2 jv2Var = this.f35939B;
                jv2 jv2Var2 = this.f35940C;
                Resources resources = viewTreeObserverOnGlobalLayoutListenerC1140sc.getContext().getResources();
                jv2Var.m7290a();
                jv2Var2.m7290a();
                k14 k14Var = (k14) lv2Var.m8197b(-1);
                i14 i14Var = k14Var != null ? k14Var.f22816a : null;
                C1127s c1127s = new C1127s((byte) 8);
                c1127s.f29778b = lv2Var;
                VarHandle.storeStoreFence();
                C1127s c1127s2 = new C1127s((byte) 9);
                c1127s2.f29778b = resources;
                VarHandle.storeStoreFence();
                ArrayList arrayListM10180b = r14.m10180b(i14Var, c1127s, c1127s2, Collections.singletonList(i14Var));
                int iM7689T = kx5.m7689T(arrayListM10180b);
                int i = 1;
                if (1 <= iM7689T) {
                    while (true) {
                        int i2 = ((i14) arrayListM10180b.get(i - 1)).f21014f;
                        int i3 = ((i14) arrayListM10180b.get(i)).f21014f;
                        jv2Var.m7295f(i2, i3);
                        jv2Var2.m7295f(i3, i2);
                        if (i == iM7689T) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f35973z;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007a A[LOOP:0: B:4:0x001b->B:36:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x007d A[EDGE_INSN: B:47:0x007d->B:37:0x007d BREAK  A[LOOP:0: B:4:0x001b->B:36:0x007a], SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final jl3 m13492n(i14 i14Var, Rect rect, p44 p44Var) {
        C1363yc c1363yc = new C1363yc();
        c1363yc.f35109b = p44Var;
        VarHandle.storeStoreFence();
        wf2 wf2Var = i14Var.f21011c;
        mt2 mt2Var = (mt2) wf2Var.f33299G.f25610g;
        px0 px0Var = null;
        if ((mt2Var.f25198d & 8) != 0) {
            loop0: while (mt2Var != null) {
                if ((mt2Var.f25197c & 8) == 0) {
                    if ((mt2Var.f25198d & 8) != 0) {
                        break;
                        break;
                    }
                    mt2Var = mt2Var.f25200f;
                } else {
                    mt2 mt2VarM10644P = mt2Var;
                    uw2 uw2Var = null;
                    while (mt2VarM10644P != null) {
                        if (mt2VarM10644P instanceof g14) {
                            ((g14) mt2VarM10644P).mo4513i0(c1363yc);
                            if (c1363yc.f35108a) {
                                px0Var = mt2VarM10644P;
                                break loop0;
                            }
                        } else if ((mt2VarM10644P.f25197c & 8) != 0 && (mt2VarM10644P instanceof qx0)) {
                            int i = 0;
                            for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                if ((mt2Var2.f25197c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        mt2VarM10644P = mt2Var2;
                                    } else {
                                        if (uw2Var == null) {
                                            uw2Var = new uw2(new mt2[16]);
                                        }
                                        if (mt2VarM10644P != null) {
                                            uw2Var.m11663b(mt2VarM10644P);
                                            mt2VarM10644P = null;
                                        }
                                        uw2Var.m11663b(mt2Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        mt2VarM10644P = sc6.m10644P(uw2Var);
                    }
                    if ((mt2Var.f25198d & 8) != 0) {
                        break;
                    }
                    mt2Var = mt2Var.f25200f;
                }
            }
        }
        px0 px0Var2 = (g14) px0Var;
        if (px0Var2 == null || !((mt2) px0Var2).f25195a.f25208n) {
            return y42.m12845Q((e13) wf2Var.f33299G.f25608e, false);
        }
        e13 e13VarM10651W = sc6.m10651W(px0Var2);
        jl3 jl3VarMo4003Q = y42.m12861j0(e13VarM10651W).mo4003Q(e13VarM10651W, false);
        Rect rectM13480G = m13480G(jl3VarMo4003Q.f22396a, jl3VarMo4003Q.f22397b, jl3VarMo4003Q.f22398c, jl3VarMo4003Q.f22399d);
        float f = rectM13480G.left - rect.left;
        float f2 = rectM13480G.top - rect.top;
        return new jl3(f, f2, rectM13480G.width() + f, rectM13480G.height() + f2);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m13493o() {
        AccessibilityManager accessibilityManager = this.f35954g;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f35956i;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f35956i = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f35956i = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f35956i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f35954g;
        if (accessibilityManager.isEnabled()) {
            this.f35956i = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f35951d.getHandler().removeCallbacks(this.f35948K);
        AccessibilityManager accessibilityManager = this.f35954g;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m13494p(wf2 wf2Var) {
        if (this.f35969v.add(wf2Var)) {
            this.f35970w.mo5493n(ju4.f22634a);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m13495t(sx3 sx3Var) {
        if (sx3Var.f30635b.contains(sx3Var)) {
            u63 snapshotObserver = this.f35951d.getSnapshotObserver();
            C1177tc c1177tc = this.f35950M;
            C0675g4 c0675g4 = new C0675g4((byte) 2);
            c0675g4.f19600b = sx3Var;
            c0675g4.f19601c = this;
            VarHandle.storeStoreFence();
            snapshotObserver.f31675a.m159e(sx3Var, c1177tc, c0675g4);
        }
    }

    /* JADX INFO: renamed from: u */
    public final int m13496u(int i) {
        if (i == this.f35951d.getSemanticsOwner().m7810a().f21014f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008b A[LOOP:1: B:15:0x004f->B:28:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008e A[EDGE_INSN: B:44:0x008e->B:29:0x008e BREAK  A[LOOP:1: B:15:0x004f->B:28:0x008b], SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    public final void m13497v(i14 i14Var, j14 j14Var) {
        int[] iArr = v52.f32420a;
        mv2 mv2Var = new mv2();
        List listM6548i = i14Var.m6548i((4 & 1) != 0 ? !i14Var.f21010b : false, (4 & 2) == 0);
        wf2 wf2Var = i14Var.f21011c;
        int size = listM6548i.size();
        for (int i = 0; i < size; i++) {
            i14 i14Var2 = (i14) listM6548i.get(i);
            m52 m52VarM13491l = m13491l();
            int i2 = i14Var2.f21014f;
            if (m52VarM13491l.m8196a(i2)) {
                if (!j14Var.f21956b.m8404b(i2)) {
                    m13494p(wf2Var);
                    return;
                }
                mv2Var.m8403a(i2);
            }
        }
        mv2 mv2Var2 = j14Var.f21956b;
        int[] iArr2 = mv2Var2.f25232b;
        long[] jArr = mv2Var2.f25231a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !mv2Var.m8404b(iArr2[(i3 << 3) + i5])) {
                            m13494p(wf2Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listM6548i2 = i14Var.m6548i((4 & 1) != 0 ? !i14Var.f21010b : false, (4 & 2) == 0);
        int size2 = listM6548i2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            i14 i14Var3 = (i14) listM6548i2.get(i6);
            j14 j14Var2 = (j14) this.f35944G.m8197b(i14Var3.f21014f);
            if (j14Var2 != null && m13491l().m8196a(i14Var3.f21014f)) {
                m13497v(i14Var3, j14Var2);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m13498w(AccessibilityEvent accessibilityEvent) {
        if (!m13493o()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f35962o = true;
        }
        try {
            return ((Boolean) this.f35953f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f35962o = false;
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m13499x(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !m13493o()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM13487h = m13487h(i, i2);
        if (num != null) {
            accessibilityEventM13487h.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM13487h.setContentDescription(yl2.m13170a(list, ",", null, 62));
        }
        return m13498w(accessibilityEventM13487h);
    }

    /* JADX INFO: renamed from: z */
    public final void m13500z(int i, String str, int i2) {
        AccessibilityEvent accessibilityEventM13487h = m13487h(m13496u(i), 32);
        accessibilityEventM13487h.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventM13487h.getText().add(str);
        }
        m13498w(accessibilityEventM13487h);
    }
}
