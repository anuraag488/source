package p000;

import ads_mobile_sdk.C0388we;
import ads_mobile_sdk.jc3;
import ads_mobile_sdk.su1;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.Log;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import com.materialkolor.ktx.BlendKt;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class sj3 {

    /* JADX INFO: renamed from: a */
    public static final pg0 f30331a = new pg0(636288403, false, new yg0(0));

    /* JADX INFO: renamed from: b */
    public static final pg0 f30332b = new pg0(-1357803046, false, new yg0(1));

    /* JADX INFO: renamed from: c */
    public static final yh3 f30333c = new yh3();

    /* JADX INFO: renamed from: d */
    public static final kq3 f30334d = new kq3();

    /* JADX INFO: renamed from: e */
    public static final z45 f30335e = new z45(4);

    /* JADX INFO: renamed from: f */
    public static final kh5 f30336f = new kh5(6);

    /* JADX INFO: renamed from: g */
    public static final int f30337g = 9;

    /* JADX INFO: renamed from: h */
    public static final int f30338h = 6;

    /* JADX INFO: renamed from: i */
    public static final int f30339i = 10;

    /* JADX INFO: renamed from: j */
    public static final int f30340j = 5;

    /* JADX INFO: renamed from: k */
    public static final int f30341k = 15;

    /* JADX INFO: renamed from: l */
    public static final int f30342l = 48;

    /* JADX INFO: renamed from: A */
    public static nz3 m10792A(yy3 yy3Var, boolean z, mi0 mi0Var, int i) {
        float f;
        float f2;
        if ((i & 1) != 0) {
            yy3Var = (yy3) ((ir1) mi0Var).m6898k(mz3.f25344a);
        }
        if ((i & 2) != 0) {
            z = false;
        }
        float f3 = (!yy3Var.f35636d || yy3Var.f35635c) ? 1.5f : 16.0f;
        nc4 nc4Var = pq2.f27894b;
        float f4 = ((p11) AbstractC0947ni.m8765a(f3, ((lq2) ((ir1) mi0Var).m6898k(nc4Var)).f24280d.mo7289f(), mi0Var).getValue()).f27285a;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        float f5 = ((p11) AbstractC0947ni.m8765a(yy3Var.f35634b ? 16.0f : 1.5f, ((lq2) ((ir1) mi0Var).m6898k(nc4Var)).f24280d.mo7289f(), mi0Var).getValue()).f27285a;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if ((i & 16) != 0) {
            f = ((p11) AbstractC0947ni.m8765a((yy3Var.f35633a ? 2.0f : 0.0f) + 10.0f, ((lq2) ((ir1) mi0Var).m6898k(nc4Var)).f24280d.mo7289f(), mi0Var).getValue()).f27285a;
            if (f < 0.0f) {
                f = 0.0f;
            }
        } else {
            f = 8.0f;
        }
        if ((i & 32) != 0) {
            f2 = ((p11) AbstractC0947ni.m8765a(10.0f + (yy3Var.f35634b ? 2.0f : 0.0f), ((lq2) ((ir1) mi0Var).m6898k(nc4Var)).f24280d.mo7289f(), mi0Var).getValue()).f27285a;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
        } else {
            f2 = 8.0f;
        }
        float f6 = ((p11) AbstractC0947ni.m8765a(z ? 8.0f : 0.0f, ((lq2) ((ir1) mi0Var).m6898k(nc4Var)).f24280d.mo7289f(), mi0Var).getValue()).f27285a;
        return new nz3(new g73(16.0f, f4, 16.0f, f5), new g73(26.0f, f, 26.0f, f2), AbstractC0647fd.m5669g(f6 >= 0.0f ? f6 : 0.0f, 1));
    }

    /* JADX INFO: renamed from: B */
    public static final z93 m10793B(mi0 mi0Var, int i, int i2) {
        String string;
        int i3 = i2 & 1;
        i50 i50Var = ki0.f23136a;
        if (i3 != 0) {
            ir1 ir1Var = (ir1) mi0Var;
            Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == i50Var) {
                objM6869O = Integer.valueOf(context.getResources().getIdentifier("es_accessibility_service_description", "string", context.getPackageName()));
                ir1Var.m6905n0(objM6869O);
            }
            string = ((Resources) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14652c)).getString(((Number) objM6869O).intValue());
        } else {
            string = "This app uses the AccessibilityService API exclusively to display the custom navigation bar above the system one.\nThis permission is used only for this feature and never to collect, store, or share your personal data.";
        }
        String str = string;
        ir1 ir1Var2 = (ir1) mi0Var;
        Context context2 = (Context) ir1Var2.m6898k(AndroidCompositionLocals_androidKt.f14651b);
        g12 g12Var = (g12) o02.f26244a.getValue();
        boolean zM6894i = ir1Var2.m6894i(context2);
        Object objM6869O2 = ir1Var2.m6869O();
        Object obj = objM6869O2;
        if (zM6894i || objM6869O2 == i50Var) {
            C1317x3 c1317x3 = new C1317x3((byte) 0);
            c1317x3.f33950b = context2;
            VarHandle.storeStoreFence();
            ir1Var2.m6905n0(c1317x3);
            obj = c1317x3;
        }
        return aa3.m154a("Accessibility", str, g12Var, (wp1) obj, new sg0((byte) 3), ir1Var2);
    }

    /* JADX INFO: renamed from: C */
    public static final C0880lp m10794C(b12 b12Var, lk3 lk3Var, yp1 yp1Var, yp1 yp1Var2, jm0 jm0Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6887e0(1645646697);
        ir1Var.m6887e0(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            b12 b12VarM5838a = fw4.m5838a(b12Var, ir1Var);
            m10803L(b12VarM5838a);
            ir1Var.m6887e0(1094691773);
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = new C0880lp(b12VarM5838a, lk3Var);
                ir1Var.m6905n0(objM6869O);
            }
            C0880lp c0880lp = (C0880lp) objM6869O;
            ir1Var.m6912r(false);
            c0880lp.f24250m = yp1Var;
            c0880lp.f24251n = yp1Var2;
            c0880lp.f24252o = jm0Var;
            c0880lp.f24253p = ((Boolean) ir1Var.m6898k(q42.f28207a)).booleanValue();
            c0880lp.f24256s.setValue(lk3Var);
            c0880lp.f24255r.setValue(b12VarM5838a);
            c0880lp.mo37c();
            ir1Var.m6912r(false);
            Trace.endSection();
            ir1Var.m6912r(false);
            return c0880lp;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m10795D(x53 x53Var, int i, Object obj) {
        x53Var.f34019j[(x53Var.f34020k - x53Var.f34015f[x53Var.f34016g - 1].f32422b) + i] = obj;
    }

    /* JADX INFO: renamed from: E */
    public static final void m10796E(x53 x53Var, int i, Object obj, int i2, Object obj2) {
        int i3 = x53Var.f34020k - x53Var.f34015f[x53Var.f34016g - 1].f32422b;
        Object[] objArr = x53Var.f34019j;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX INFO: renamed from: F */
    public static final void m10797F(x53 x53Var, Object obj, Object obj2, Object obj3) {
        int i = x53Var.f34020k - x53Var.f34015f[x53Var.f34016g - 1].f32422b;
        Object[] objArr = x53Var.f34019j;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: G */
    public static String m10798G(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: H */
    public static oz3 m10799H(qn4 qn4Var, xy3 xy3Var, nz3 nz3Var, mi0 mi0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            qn4Var = qn4.f28626c;
        }
        yy3 yy3Var = (yy3) ((ir1) mi0Var).m6898k(mz3.f25344a);
        boolean z = (i2 & 4) == 0;
        if ((i2 & 16) != 0) {
            xy3Var = m10822r(qn4Var, z, mi0Var, 0);
        }
        float f = yy3Var.f35633a ? 30.0f : 6.0f;
        nc4 nc4Var = pq2.f27894b;
        ir1 ir1Var = (ir1) mi0Var;
        xb4 xb4VarM8765a = AbstractC0947ni.m8765a(f, ((lq2) ir1Var.m6898k(nc4Var)).f24280d.mo7289f(), mi0Var);
        xb4 xb4VarM8765a2 = AbstractC0947ni.m8765a(yy3Var.f35634b ? 30.0f : 6.0f, ((lq2) ir1Var.m6898k(nc4Var)).f24280d.mo7289f(), mi0Var);
        fr3 fr3VarM6152b = gr3.m6152b(((p11) xb4VarM8765a.getValue()).f27285a, ((p11) xb4VarM8765a.getValue()).f27285a, ((p11) xb4VarM8765a2.getValue()).f27285a, ((p11) xb4VarM8765a2.getValue()).f27285a);
        if ((i2 & 64) != 0) {
            nz3Var = m10792A(yy3Var, z, mi0Var, 252);
        }
        return new oz3(xy3Var, fr3VarM6152b, nz3Var);
    }

    /* JADX INFO: renamed from: I */
    public static final int m10800I(kv2 kv2Var) {
        int iM7635c;
        int i = kv2Var.f23538b;
        int iM7635c2 = kv2Var.m7635c(0);
        while (kv2Var.f23538b != 0 && kv2Var.m7635c(0) == iM7635c2) {
            kv2Var.m7638f(0, kv2Var.m7636d());
            kv2Var.m7637e(kv2Var.f23538b - 1);
            int i2 = kv2Var.f23538b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iM7635c3 = kv2Var.m7635c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iM7635c4 = kv2Var.m7635c(i6);
                if (i5 < i2 && (iM7635c = kv2Var.m7635c(i5)) > iM7635c4) {
                    if (iM7635c <= iM7635c3) {
                        break;
                    }
                    kv2Var.m7638f(i4, iM7635c);
                    kv2Var.m7638f(i5, iM7635c3);
                    i4 = i5;
                } else {
                    if (iM7635c4 <= iM7635c3) {
                        break;
                    }
                    kv2Var.m7638f(i4, iM7635c4);
                    kv2Var.m7638f(i6, iM7635c3);
                    i4 = i6;
                }
            }
        }
        return iM7635c2;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m10801J(Context context, int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) r35.m10189a(context).f34949a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m10802K(String str) {
        throw new IllegalArgumentException(c75.m3879k("Unsupported type: ", str, ". ", zi4.m13621u("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    /* JADX INFO: renamed from: L */
    public static final void m10803L(b12 b12Var) {
        Object obj = b12Var.f14997b;
        if (obj instanceof a12) {
            C1077qn.m9987m("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof t02) {
            m10802K("ImageBitmap");
            throw null;
        }
        if (obj instanceof g12) {
            m10802K("ImageVector");
            throw null;
        }
        if (obj instanceof i73) {
            m10802K("Painter");
            throw null;
        }
        if (b12Var.f14998c == null) {
            return;
        }
        C1077qn.m9987m("request.target must be null.");
    }

    /* JADX INFO: renamed from: M */
    public static final void m10804M(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:0x015e  */
    /* JADX WARN: Code duplicated, block: B:78:0x016e  */
    /* JADX WARN: Code duplicated, block: B:89:0x019a  */
    /* JADX WARN: Code duplicated, block: B:90:0x019c  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a6  */
    /* JADX INFO: renamed from: a */
    public static final void m10805a(nt2 nt2Var, d64 d64Var, wp1 wp1Var, float f, boolean z, boolean z2, mq1 mq1Var, mq1 mq1Var2, p44 p44Var, long j, long j2, float f2, pg0 pg0Var, mi0 mi0Var, int i) {
        nt2 nt2Var2;
        float f3;
        boolean z3;
        p44 p44Var2;
        long j3;
        long j4;
        float f4;
        long jM6742b;
        long j5;
        int i2;
        p44 p44Var3;
        nt2 nt2Var3;
        boolean z4;
        nt2 nt2Var4;
        boolean z5;
        boolean zM6894i;
        i50 i50Var;
        Object obj;
        Object objM6869O;
        C0910mi c0910mi;
        Object objM6869O2;
        zo0 zo0Var;
        boolean z6;
        boolean z7;
        Object obj2;
        wp1 wp1Var2;
        boolean z8;
        boolean zM6894i2;
        Object objM6869O3;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(57000307);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= ir1Var.m6890g(d64Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ir1Var.m6894i(wp1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ir1Var.m6892h(z) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            i4 |= ir1Var.m6894i(mq1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= ir1Var.m6894i(mq1Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= 268435456;
        }
        if (ir1Var.m6871T(i4 & 1, (306783379 & i4) != 306783378)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                p44 p44VarM10977a = t44.m10977a(3, ir1Var);
                long jM6745e = ic0.m6745e(39, ir1Var);
                jM6742b = ic0.m6742b(jM6745e, ir1Var);
                j5 = jM6745e;
                i2 = i4 & (-2113936385);
                p44Var3 = p44VarM10977a;
                nt2Var3 = kt2.f23428a;
                f3 = 640.0f;
                f4 = 1.0f;
                z4 = true;
            } else {
                ir1Var.m6874W();
                f3 = f;
                z4 = z2;
                p44Var3 = p44Var;
                j5 = j;
                jM6742b = j2;
                f4 = f2;
                i2 = i4 & (-2113936385);
                nt2Var3 = nt2Var;
            }
            ir1Var.m6913s();
            nc4 nc4Var = pq2.f27894b;
            db4 db4VarMo7289f = ((lq2) ir1Var.m6898k(nc4Var)).f24280d.mo7289f();
            db4 db4VarMo7288e = ((lq2) ir1Var.m6898k(nc4Var)).f24280d.mo7288e();
            db4 db4VarMo7289f2 = ((lq2) ir1Var.m6898k(nc4Var)).f24280d.mo7289f();
            int i5 = (i2 & 112) ^ 48;
            if (i5 <= 32 || !ir1Var.m6890g(d64Var)) {
                nt2Var4 = nt2Var3;
                if ((i2 & 48) != 32) {
                    z5 = false;
                }
                zM6894i = z5 | ir1Var.m6894i(db4VarMo7289f) | ir1Var.m6894i(db4VarMo7288e) | ir1Var.m6894i(db4VarMo7289f2);
                Object objM6869O4 = ir1Var.m6869O();
                i50Var = ki0.f23136a;
                obj = objM6869O4;
                if (zM6894i || objM6869O4 == i50Var) {
                    C1048pv c1048pv = new C1048pv((byte) 2);
                    c1048pv.f28016b = d64Var;
                    c1048pv.f28017c = db4VarMo7289f;
                    c1048pv.f28018d = db4VarMo7288e;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c1048pv);
                    obj = c1048pv;
                }
                lb5.m7914W(ir1Var, (wp1) obj);
                objM6869O = ir1Var.m6869O();
                if (objM6869O == i50Var) {
                    objM6869O = dt0.m4700c(0.0f);
                    ir1Var.m6905n0(objM6869O);
                }
                c0910mi = (C0910mi) objM6869O;
                objM6869O2 = ir1Var.m6869O();
                if (objM6869O2 == i50Var) {
                    objM6869O2 = lb5.m7942w(r71.f29063a, ir1Var);
                    ir1Var.m6905n0(objM6869O2);
                }
                zo0Var = (zo0) objM6869O2;
                boolean zM6894i3 = ((i5 <= 32 && ir1Var.m6890g(d64Var)) || (i2 & 48) == 32) | ir1Var.m6894i(zo0Var) | ir1Var.m6894i(c0910mi);
                if ((i2 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zM6894i3 | z6;
                Object objM6869O5 = ir1Var.m6869O();
                obj2 = objM6869O5;
                if (z7 || objM6869O5 == i50Var) {
                    C0590dx c0590dx = new C0590dx((byte) 2);
                    c0590dx.f17475e = d64Var;
                    c0590dx.f17472b = zo0Var;
                    c0590dx.f17473c = c0910mi;
                    c0590dx.f17474d = wp1Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0590dx);
                    obj2 = c0590dx;
                }
                wp1Var2 = (wp1) obj2;
                if (z4 || !d64Var.m4388e()) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                zM6894i2 = ir1Var.m6894i(c0910mi) | ir1Var.m6890g(wp1Var2);
                objM6869O3 = ir1Var.m6869O();
                if (zM6894i2 || objM6869O3 == i50Var) {
                    objM6869O3 = new C1199ty((Object) wp1Var2, (Object) c0910mi, (wm0) null, (byte) 1);
                    ir1Var.m6905n0(objM6869O3);
                }
                gq6.m6080e(z8, (mq1) objM6869O3, ir1Var, 0);
                float fFloatValue = ((Number) c0910mi.m8328d()).floatValue();
                int i6 = (i2 << 3) & 524272;
                int i7 = i2 >> 15;
                int i8 = (i7 & 896) | (i7 & 112) | 6 | 3072;
                p44Var2 = p44Var3;
                j3 = j5;
                j4 = jM6742b;
                nt2Var2 = nt2Var4;
                m10806b(fFloatValue, nt2Var2, d64Var, wp1Var, f3, z, p44Var2, j3, j4, f4, mq1Var, mq1Var2, pg0Var, ir1Var, i6, i8);
                z3 = z4;
            } else {
                nt2Var4 = nt2Var3;
            }
            z5 = true;
            zM6894i = z5 | ir1Var.m6894i(db4VarMo7289f) | ir1Var.m6894i(db4VarMo7288e) | ir1Var.m6894i(db4VarMo7289f2);
            Object objM6869O6 = ir1Var.m6869O();
            i50Var = ki0.f23136a;
            obj = objM6869O6;
            if (zM6894i) {
                C1048pv c1048pv2 = new C1048pv((byte) 2);
                c1048pv2.f28016b = d64Var;
                c1048pv2.f28017c = db4VarMo7289f;
                c1048pv2.f28018d = db4VarMo7288e;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1048pv2);
                obj = c1048pv2;
            } else {
                C1048pv c1048pv3 = new C1048pv((byte) 2);
                c1048pv3.f28016b = d64Var;
                c1048pv3.f28017c = db4VarMo7289f;
                c1048pv3.f28018d = db4VarMo7288e;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1048pv3);
                obj = c1048pv3;
            }
            lb5.m7914W(ir1Var, (wp1) obj);
            objM6869O = ir1Var.m6869O();
            if (objM6869O == i50Var) {
                objM6869O = dt0.m4700c(0.0f);
                ir1Var.m6905n0(objM6869O);
            }
            c0910mi = (C0910mi) objM6869O;
            objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = lb5.m7942w(r71.f29063a, ir1Var);
                ir1Var.m6905n0(objM6869O2);
            }
            zo0Var = (zo0) objM6869O2;
            boolean zM6894i4 = ((i5 <= 32 && ir1Var.m6890g(d64Var)) || (i2 & 48) == 32) | ir1Var.m6894i(zo0Var) | ir1Var.m6894i(c0910mi);
            if ((i2 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = zM6894i4 | z6;
            Object objM6869O7 = ir1Var.m6869O();
            obj2 = objM6869O7;
            if (z7) {
                C0590dx c0590dx2 = new C0590dx((byte) 2);
                c0590dx2.f17475e = d64Var;
                c0590dx2.f17472b = zo0Var;
                c0590dx2.f17473c = c0910mi;
                c0590dx2.f17474d = wp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0590dx2);
                obj2 = c0590dx2;
            } else {
                C0590dx c0590dx3 = new C0590dx((byte) 2);
                c0590dx3.f17475e = d64Var;
                c0590dx3.f17472b = zo0Var;
                c0590dx3.f17473c = c0910mi;
                c0590dx3.f17474d = wp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0590dx3);
                obj2 = c0590dx3;
            }
            wp1Var2 = (wp1) obj2;
            if (z4) {
                z8 = false;
            } else {
                z8 = false;
            }
            zM6894i2 = ir1Var.m6894i(c0910mi) | ir1Var.m6890g(wp1Var2);
            objM6869O3 = ir1Var.m6869O();
            if (zM6894i2) {
                objM6869O3 = new C1199ty((Object) wp1Var2, (Object) c0910mi, (wm0) null, (byte) 1);
                ir1Var.m6905n0(objM6869O3);
            } else {
                objM6869O3 = new C1199ty((Object) wp1Var2, (Object) c0910mi, (wm0) null, (byte) 1);
                ir1Var.m6905n0(objM6869O3);
            }
            gq6.m6080e(z8, (mq1) objM6869O3, ir1Var, 0);
            float fFloatValue2 = ((Number) c0910mi.m8328d()).floatValue();
            int i9 = (i2 << 3) & 524272;
            int i10 = i2 >> 15;
            int i11 = (i10 & 896) | (i10 & 112) | 6 | 3072;
            p44Var2 = p44Var3;
            j3 = j5;
            j4 = jM6742b;
            nt2Var2 = nt2Var4;
            m10806b(fFloatValue2, nt2Var2, d64Var, wp1Var, f3, z, p44Var2, j3, j4, f4, mq1Var, mq1Var2, pg0Var, ir1Var, i9, i11);
            z3 = z4;
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
            f3 = f;
            z3 = z2;
            p44Var2 = p44Var;
            j3 = j;
            j4 = j2;
            f4 = f2;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            p10 p10Var = new p10();
            p10Var.f27271a = nt2Var2;
            p10Var.f27272b = d64Var;
            p10Var.f27273c = wp1Var;
            p10Var.f27274d = f3;
            p10Var.f27275e = z;
            p10Var.f27276f = z3;
            p10Var.f27277g = mq1Var;
            p10Var.f27278h = mq1Var2;
            p10Var.f27279i = p44Var2;
            p10Var.f27280j = j3;
            p10Var.f27281k = j4;
            p10Var.f27282l = f4;
            p10Var.f27283m = pg0Var;
            p10Var.f27284n = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = p10Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10806b(float f, nt2 nt2Var, d64 d64Var, wp1 wp1Var, float f2, boolean z, p44 p44Var, long j, long j2, float f3, mq1 mq1Var, mq1 mq1Var2, pg0 pg0Var, mi0 mi0Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        p44 p44Var2;
        long j3;
        long j4;
        float f4;
        ir1 ir1Var;
        Object obj;
        byte b;
        Object obj2;
        float f5 = f;
        boolean z2 = z;
        ir1 ir1Var2 = (ir1) mi0Var;
        ir1Var2.m6889f0(-780255289);
        if ((i & 6) == 0) {
            i3 = (ir1Var2.m6884d(f5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ir1Var2.m6890g(nt2Var) ? 32 : 16;
        }
        int i6 = i3;
        if ((i & 384) == 0) {
            i4 = i6 | (ir1Var2.m6890g(d64Var) ? 256 : 128);
        } else {
            i4 = i6;
        }
        if ((i & 3072) == 0) {
            i4 |= ir1Var2.m6894i(wp1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= ir1Var2.m6884d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= ir1Var2.m6892h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= ir1Var2.m6890g(p44Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= ir1Var2.m6888f(j) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= ir1Var2.m6888f(j2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= ir1Var2.m6884d(f3) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (ir1Var2.m6884d(0.0f) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= ir1Var2.m6894i(mq1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= ir1Var2.m6894i(mq1Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= ir1Var2.m6894i(pg0Var) ? 2048 : 1024;
        }
        int i8 = i5;
        if (ir1Var2.m6871T(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            ir1Var2.m6876Y();
            if ((i & 1) != 0 && !ir1Var2.m6856B()) {
                ir1Var2.m6874W();
            }
            ir1Var2.m6913s();
            String strM11818B = vd6.m11818B(C0995R.string.m3c_bottom_sheet_pane_title, ir1Var2);
            fy4 fy4Var = (fy4) ir1Var2.m6898k(ij0.f21485t);
            db4 db4VarMo7289f = ((lq2) ir1Var2.m6898k(pq2.f27894b)).f24280d.mo7289f();
            nc4 nc4Var = ij0.f21473h;
            ky0 ky0Var = (ky0) ir1Var2.m6898k(nc4Var);
            rq4 rq4Var = AbstractC1212ua.f31742a;
            C0940nb c0940nb = d64Var.f16820d;
            C0940nb c0940nb2 = d64Var.f16820d;
            int i9 = (i7 & 896) ^ 384;
            boolean z3 = (i9 > 256 && ir1Var2.m6890g(d64Var)) || (i7 & 384) == 256;
            Object objM6869O = ir1Var2.m6869O();
            boolean z4 = z3;
            i50 i50Var = ki0.f23136a;
            if (z4 || objM6869O == i50Var) {
                q10 q10Var = new q10((byte) 0);
                q10Var.f28137b = d64Var;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(q10Var);
                obj = q10Var;
            } else {
                obj = objM6869O;
            }
            yp1 yp1Var = (yp1) obj;
            ky0 ky0Var2 = (ky0) ir1Var2.m6898k(nc4Var);
            boolean zM6890g = ir1Var2.m6890g(ky0Var2) | ir1Var2.m6890g(c0940nb) | ir1Var2.m6890g(yp1Var) | ir1Var2.m6890g(db4VarMo7289f);
            Object objM6869O2 = ir1Var2.m6869O();
            if (zM6890g || objM6869O2 == i50Var) {
                objM6869O2 = AbstractC0485bb.m3535b(c0940nb, ky0Var2, yp1Var, db4VarMo7289f);
                ir1Var2.m6905n0(objM6869O2);
            }
            z84 z84Var = (z84) objM6869O2;
            boolean zM6890g2 = ir1Var2.m6890g(z84Var) | ((i9 > 256 && ir1Var2.m6890g(d64Var)) || (i7 & 384) == 256) | ir1Var2.m6890g(fy4Var) | ir1Var2.m6890g(ky0Var);
            Object objM6869O3 = ir1Var2.m6869O();
            Object obj3 = objM6869O3;
            if (zM6890g2 || objM6869O3 == i50Var) {
                w10 w10Var = new w10();
                w10Var.f33013a = fy4Var;
                w10Var.f33014b = d64Var;
                w10Var.f33015c = ky0Var;
                w10Var.f33016d = z84Var;
                w10Var.f33017e = wp1Var;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(w10Var);
                obj3 = w10Var;
            }
            w10 w10Var2 = (w10) obj3;
            Object objM6869O4 = ir1Var2.m6869O();
            if (objM6869O4 == i50Var) {
                objM6869O4 = lb5.m7942w(r71.f29063a, ir1Var2);
                ir1Var2.m6905n0(objM6869O4);
            }
            zo0 zo0Var = (zo0) objM6869O4;
            boolean zM6894i = ((i9 > 256 && ir1Var2.m6890g(d64Var)) || (i7 & 384) == 256) | ir1Var2.m6894i(zo0Var) | ((i7 & 7168) == 2048);
            Object objM6869O5 = ir1Var2.m6869O();
            if (zM6894i || objM6869O5 == i50Var) {
                b = 1;
                j10 j10Var = new j10(b);
                j10Var.f21946b = d64Var;
                j10Var.f21947c = zo0Var;
                j10Var.f21948d = wp1Var;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(j10Var);
                obj2 = j10Var;
            } else {
                b = 1;
                obj2 = objM6869O5;
            }
            wp1 wp1Var2 = (wp1) obj2;
            nt2 nt2VarM8574b = n74.m8574b(n74.m8584l(nt2Var, 0.0f, f2, b), 1.0f);
            nt2 nt2VarM4289D = kt2.f23428a;
            if (z) {
                ir1Var2.m6885d0(1794078282);
                boolean z5 = (i9 > 256 && ir1Var2.m6890g(d64Var)) || (i7 & 384) == 256;
                Object objM6869O6 = ir1Var2.m6869O();
                Object obj4 = objM6869O6;
                if (z5 || objM6869O6 == i50Var) {
                    d63 d63Var = d63.f16814a;
                    int i10 = v54.f32423a;
                    u54 u54Var = new u54();
                    u54Var.f31660a = d64Var;
                    u54Var.f31661b = w10Var2;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(u54Var);
                    obj4 = u54Var;
                }
                nt2VarM4289D = d24.m4289D(nt2VarM4289D, (d03) obj4, null);
                ir1Var2.m6912r(false);
            } else {
                ir1Var2.m6885d0(1794093103);
                ir1Var2.m6912r(false);
            }
            nt2 nt2VarMo7630d = nt2VarM8574b.mo7630d(nt2VarM4289D);
            d63 d63Var2 = d63.f16814a;
            boolean z6 = (i9 > 256 && ir1Var2.m6890g(d64Var)) || (i7 & 384) == 256;
            Object objM6869O7 = ir1Var2.m6869O();
            Object obj5 = objM6869O7;
            if (z6 || objM6869O7 == i50Var) {
                C1017p0 c1017p0 = new C1017p0((byte) 5);
                c1017p0.f27254b = d64Var;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(c1017p0);
                obj5 = c1017p0;
            }
            nt2 nt2VarM3534a = AbstractC0485bb.m3534a(C0006a5.m75m(nt2VarMo7630d, c0940nb2, (mq1) obj5), c0940nb2, z && d64Var.m4386c() != e64.f17842a, w10Var2);
            boolean zM6890g3 = ir1Var2.m6890g(strM11818B);
            Object objM6869O8 = ir1Var2.m6869O();
            Object obj6 = objM6869O8;
            if (zM6890g3 || objM6869O8 == i50Var) {
                C1051py c1051py = new C1051py((byte) 1);
                c1051py.f28076b = strM11818B;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(c1051py);
                obj6 = c1051py;
            }
            nt2 nt2VarM5458a = f14.m5458a(nt2VarM3534a, false, (yp1) obj6);
            m10 m10Var = new m10((byte) 0);
            m10Var.f24531c = d64Var;
            m10Var.f24530b = f;
            VarHandle.storeStoreFence();
            nt2 nt2VarM10693F = se0.m10693F(nt2VarM5458a, m10Var);
            int i11 = v54.f32423a;
            q10 q10Var2 = new q10((byte) 1);
            q10Var2.f28137b = d64Var;
            VarHandle.storeStoreFence();
            nt2 nt2VarM10693F2 = se0.m10693F(nt2VarM10693F, q10Var2);
            r10 r10Var = new r10((byte) 0);
            r10Var.f28947d = mq1Var2;
            r10Var.f28945b = f;
            r10Var.f28949f = d64Var;
            r10Var.f28948e = mq1Var;
            r10Var.f28950g = wp1Var2;
            r10Var.f28951h = zo0Var;
            r10Var.f28946c = z;
            r10Var.f28952i = pg0Var;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(1483196812, r10Var, ir1Var2);
            int i12 = i7 >> 15;
            int i13 = (i12 & 57344) | (i12 & 112) | 12582912 | (i12 & 896) | (i12 & 7168) | (458752 & (i8 << 15));
            f5 = f;
            j3 = j;
            j4 = j2;
            f4 = f3;
            ir1 ir1Var3 = ir1Var2;
            z2 = z;
            p44Var2 = p44Var;
            kf4.m7511a(nt2VarM10693F2, p44Var2, j3, j4, f4, pg0VarM11834R, ir1Var3, i13, 64);
            ir1Var = ir1Var3;
        } else {
            p44Var2 = p44Var;
            j3 = j;
            j4 = j2;
            f4 = f3;
            ir1 ir1Var4 = ir1Var2;
            ir1Var4.m6874W();
            ir1Var = ir1Var4;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            s10 s10Var = new s10();
            s10Var.f29803a = f5;
            s10Var.f29804b = nt2Var;
            s10Var.f29805c = d64Var;
            s10Var.f29806d = wp1Var;
            s10Var.f29807e = f2;
            s10Var.f29808f = z2;
            s10Var.f29809g = p44Var2;
            s10Var.f29810h = j3;
            s10Var.f29811i = j4;
            s10Var.f29812j = f4;
            s10Var.f29813k = mq1Var;
            s10Var.f29814l = mq1Var2;
            s10Var.f29815m = pg0Var;
            s10Var.f29816n = i;
            s10Var.f29817o = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = s10Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final yc1 m10807c(Throwable th) {
        yc1 yc1Var = new yc1();
        yc1Var.f35112a = th;
        VarHandle.storeStoreFence();
        return yc1Var;
    }

    /* JADX INFO: renamed from: d */
    public static final void m10808d(nt2 nt2Var, si2 si2Var, e73 e73Var, InterfaceC1299wn interfaceC1299wn, C0779iz c0779iz, xh1 xh1Var, boolean z, C1289wd c1289wd, yp1 yp1Var, mi0 mi0Var, int i) {
        int i2;
        xh1 xh1Var2;
        boolean z2;
        C1289wd c1289wdM8546b;
        int i3;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(53695811);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(si2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(e73Var) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 |= ir1Var.m6890g(interfaceC1299wn) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= ir1Var.m6890g(c0779iz) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 12582912 | i4;
        if ((100663296 & i) == 0) {
            i5 = 46137344 | i4;
        }
        if ((805306368 & i) == 0) {
            i5 |= ir1Var.m6894i(yp1Var) ? 536870912 : 268435456;
        }
        if (ir1Var.m6871T(i5 & 1, (306783379 & i5) != 306783378)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                gv0 gv0VarM12642a = xa4.m12642a(ir1Var);
                boolean zM6890g = ir1Var.m6890g(gv0VarM12642a);
                Object objM6869O = ir1Var.m6869O();
                if (zM6890g || objM6869O == ki0.f23136a) {
                    objM6869O = new aw0(gv0VarM12642a);
                    ir1Var.m6905n0(objM6869O);
                }
                xh1Var2 = (aw0) objM6869O;
                c1289wdM8546b = n63.m8546b(ir1Var);
                i3 = i5 & (-238551041);
                z2 = true;
            } else {
                ir1Var.m6874W();
                int i6 = i5 & (-238551041);
                z2 = z;
                c1289wdM8546b = c1289wd;
                i3 = i6;
                xh1Var2 = xh1Var;
            }
            ir1Var.m6913s();
            ks5.m7604e(nt2Var, si2Var, e73Var, true, xh1Var2, z2, c1289wdM8546b, c0779iz, interfaceC1299wn, null, null, yp1Var, ir1Var, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i3 >> 3) & 3670016) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
        } else {
            ir1Var.m6874W();
            xh1Var2 = xh1Var;
            z2 = z;
            c1289wdM8546b = c1289wd;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            rg2 rg2Var = new rg2((byte) 1);
            rg2Var.f29249b = nt2Var;
            rg2Var.f29250c = si2Var;
            rg2Var.f29251d = e73Var;
            rg2Var.f29257j = interfaceC1299wn;
            rg2Var.f29258k = c0779iz;
            rg2Var.f29252e = xh1Var2;
            rg2Var.f29253f = z2;
            rg2Var.f29254g = c1289wdM8546b;
            rg2Var.f29255h = yp1Var;
            rg2Var.f29256i = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = rg2Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m10809e(nt2 nt2Var, si2 si2Var, e73 e73Var, InterfaceC1188tn interfaceC1188tn, C0816jz c0816jz, xh1 xh1Var, boolean z, C1289wd c1289wd, yp1 yp1Var, mi0 mi0Var, int i) {
        int i2;
        xh1 xh1Var2;
        boolean z2;
        C1289wd c1289wdM8546b;
        int i3;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1884325601);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(si2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(e73Var) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 |= ir1Var.m6890g(interfaceC1188tn) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= ir1Var.m6890g(c0816jz) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 12582912 | i4;
        if ((100663296 & i) == 0) {
            i5 = 46137344 | i4;
        }
        if ((805306368 & i) == 0) {
            i5 |= ir1Var.m6894i(yp1Var) ? 536870912 : 268435456;
        }
        if (ir1Var.m6871T(i5 & 1, (306783379 & i5) != 306783378)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                gv0 gv0VarM12642a = xa4.m12642a(ir1Var);
                boolean zM6890g = ir1Var.m6890g(gv0VarM12642a);
                Object objM6869O = ir1Var.m6869O();
                if (zM6890g || objM6869O == ki0.f23136a) {
                    objM6869O = new aw0(gv0VarM12642a);
                    ir1Var.m6905n0(objM6869O);
                }
                xh1Var2 = (aw0) objM6869O;
                i3 = i5 & (-238551041);
                z2 = true;
                c1289wdM8546b = n63.m8546b(ir1Var);
            } else {
                ir1Var.m6874W();
                int i6 = i5 & (-238551041);
                z2 = z;
                c1289wdM8546b = c1289wd;
                i3 = i6;
                xh1Var2 = xh1Var;
            }
            ir1Var.m6913s();
            ks5.m7604e(nt2Var, si2Var, e73Var, false, xh1Var2, z2, c1289wdM8546b, null, null, c0816jz, interfaceC1188tn, yp1Var, ir1Var, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i3 >> 3) & 3670016), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
        } else {
            ir1Var.m6874W();
            xh1Var2 = xh1Var;
            z2 = z;
            c1289wdM8546b = c1289wd;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            rg2 rg2Var = new rg2((byte) 0);
            rg2Var.f29249b = nt2Var;
            rg2Var.f29250c = si2Var;
            rg2Var.f29251d = e73Var;
            rg2Var.f29257j = interfaceC1188tn;
            rg2Var.f29258k = c0816jz;
            rg2Var.f29252e = xh1Var2;
            rg2Var.f29253f = z2;
            rg2Var.f29254g = c1289wdM8546b;
            rg2Var.f29255h = yp1Var;
            rg2Var.f29256i = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = rg2Var;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final nv2 m10810f() {
        nv2 nv2Var = new nv2();
        nv2Var.f26111a = z44.m13332b(16, 1, y30.f34833b);
        VarHandle.storeStoreFence();
        return nv2Var;
    }

    /* JADX INFO: renamed from: g */
    public static jc3 m10811g(wa2 wa2Var) {
        jc3 jc3Var = null;
        try {
            String strM2258a = su1.m2258a(wa2Var, "click_string", "");
            String strM2258a2 = su1.m2258a(wa2Var, "report_url", "");
            int i = 0;
            boolean zM2267a = su1.m2267a(wa2Var, "non_malicious_reporting_enabled", false);
            boolean zM2267a2 = su1.m2267a(wa2Var, "protection_enabled", false);
            o92 o92VarM2271e = su1.m2271e(wa2Var, "allowed_headers");
            ArrayList arrayList = new ArrayList();
            if (o92VarM2271e != null) {
                ArrayList arrayList2 = o92VarM2271e.f26491a;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        kx5.m7735t0();
                        throw null;
                    }
                    String strMo3532s = ((ba2) obj).mo3532s();
                    if (strMo3532s != null) {
                        arrayList.add(strMo3532s);
                    }
                    i = i3;
                }
            }
            jc3Var = new jc3(strM2258a, strM2258a2, zM2267a, zM2267a2, arrayList);
        } catch (Exception e) {
            ArrayList arrayList3 = i20.m6589n(e).f5884s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList3.add(message);
        }
        return jc3Var == null ? new jc3() : jc3Var;
    }

    /* JADX INFO: renamed from: h */
    public static C0388we m10812h(EnumC1208u6 enumC1208u6, String str, int i) {
        C0388we c0388we = new C0388we();
        c0388we.f12974d = enumC1208u6;
        c0388we.f12975e = str;
        c0388we.f12976f = i;
        c0388we.f12971a = enumC1208u6;
        c0388we.f12972b = str;
        c0388we.f12973c = i;
        VarHandle.storeStoreFence();
        return c0388we;
    }

    /* JADX INFO: renamed from: i */
    public static final void m10813i(kv2 kv2Var, int i) {
        if (kv2Var.f23538b == 0 || !(kv2Var.m7635c(0) == i || kv2Var.m7635c(kv2Var.f23538b - 1) == i)) {
            int i2 = kv2Var.f23538b;
            kv2Var.m7633a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iM7635c = kv2Var.m7635c(i3);
                if (i <= iM7635c) {
                    break;
                }
                kv2Var.m7638f(i2, iM7635c);
                i2 = i3;
            }
            kv2Var.m7638f(i2, i);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C0388we m10814j(EnumC1208u6 enumC1208u6, String str, int i) {
        if ((i & 1) != 0) {
            enumC1208u6 = EnumC1208u6.f31662a;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        return m10812h(enumC1208u6, str, 0);
    }

    /* JADX INFO: renamed from: k */
    public static final float m10815k(jp3 jp3Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jp3Var.f22503o >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (zp0.m13656G(0.0f, Math.min(jp3Var.f22505q.mo3580c() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    /* JADX INFO: renamed from: l */
    public static final float m10816l(jp3 jp3Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jp3Var.f22503o & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (zp0.m13656G(0.0f, Math.min(jp3Var.f22505q.mo3580c() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    /* JADX INFO: renamed from: m */
    public static void m10817m(String str) {
        if (str.length() <= 0) {
            C1077qn.m9987m("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                C1077qn.m9988n(zv4.m13812g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m10818n(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                C1077qn.m9988n(zv4.m13812g("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2).concat(zv4.m13820o(str2) ? "" : ": ".concat(str)));
                return;
            }
        }
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: o */
    public static String m10819o(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: p */
    public static final Object m10820p(si1 si1Var, mq1 mq1Var, of4 of4Var) {
        int i = pj1.f27653a;
        Object objCollect = as4.m3260s(new l80(new oj1(mq1Var, null), si1Var, r71.f29063a, -2, y30.f34832a), 0).collect(r13.f28955a, of4Var);
        ap0 ap0Var = ap0.f14763a;
        ju4 ju4Var = ju4.f22634a;
        if (objCollect != ap0Var) {
            objCollect = ju4Var;
        }
        return objCollect == ap0Var ? objCollect : ju4Var;
    }

    /* JADX INFO: renamed from: q */
    public static final dj4 m10821q(px0 px0Var) {
        oj4 oj4Var;
        bj4 bj4Var = new bj4();
        cw2 cw2Var = new cw2();
        bj4Var.f15334a = cw2Var;
        bj4Var.f15335b = new cw2();
        VarHandle.storeStoreFence();
        new C0633f0(1, bj4Var, bj4.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 24);
        o04 o04Var = new o04((byte) 13);
        o04Var.f26271b = bj4Var;
        VarHandle.storeStoreFence();
        o04 o04Var2 = new o04((byte) 14);
        o04Var2.f26271b = o04Var;
        VarHandle.storeStoreFence();
        dt0.m4695X(px0Var, fj4.f19047a, o04Var2);
        cw2 cw2Var2 = new cw2();
        Object[] objArr = cw2Var.f16532a;
        int i = cw2Var.f16533b;
        byte b = 0;
        int i2 = 0;
        boolean z = true;
        cj4 cj4Var = null;
        while (true) {
            oj4Var = oj4.f26787b;
            if (i2 >= i) {
                break;
            }
            cj4 cj4Var2 = (cj4) objArr[i2];
            if (!z || cj4Var2 != oj4Var) {
                if (cj4Var2 == oj4Var && cj4Var == oj4Var) {
                    z = false;
                } else {
                    if (cj4Var2 != oj4Var) {
                        cw2 cw2Var3 = bj4Var.f15335b;
                        Object[] objArr2 = cw2Var3.f16532a;
                        int i3 = cw2Var3.f16533b;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((yp1) objArr2[i4]).invoke(cj4Var2)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    cw2Var2.m4200a(cj4Var2);
                    z = false;
                    cj4Var = cj4Var2;
                }
            }
            i2++;
        }
        if (((cj4) (cw2Var2.m4208i() ? null : cw2Var2.f16532a[cw2Var2.f16533b - 1])) == oj4Var) {
            cw2Var2.m4211l(cw2Var2.f16533b - 1);
        }
        aw2 aw2Var = cw2Var2.f16534c;
        if (aw2Var == null) {
            aw2Var = new aw2(b);
            aw2Var.f14915b = cw2Var2;
            VarHandle.storeStoreFence();
            cw2Var2.f16534c = aw2Var;
        }
        return new dj4(aw2Var);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX INFO: renamed from: r */
    public static xy3 m10822r(qn4 qn4Var, boolean z, mi0 mi0Var, int i) {
        long jM13914blendjxsXWHM;
        long jM6741a;
        long j;
        long j2;
        dc0 dc0Var = ((lq2) ((ir1) mi0Var).m6898k(pq2.f27894b)).f24277a;
        if (z) {
            jM13914blendjxsXWHM = dc0Var.f16953j;
        } else {
            int iOrdinal = qn4Var.ordinal();
            if (iOrdinal == 0) {
                jM13914blendjxsXWHM = dc0Var.f16968y;
            } else if (iOrdinal == 1) {
                jM13914blendjxsXWHM = BlendKt.m13914blendjxsXWHM(ic0.m6747g(dc0Var, 8.0f), mz3.f25345b, 0.13f);
            } else if (iOrdinal == 2) {
                jM13914blendjxsXWHM = ic0.m6747g(dc0Var, 12.0f);
            } else if (iOrdinal == 3) {
                jM13914blendjxsXWHM = dc0Var.f16940a;
            } else {
                if (iOrdinal != 4) {
                    C0670g.m5864c();
                    return null;
                }
                jM13914blendjxsXWHM = dc0Var.f16951h;
            }
        }
        long j3 = jM13914blendjxsXWHM;
        if (z || qn4Var == qn4.f28627d) {
            jM6741a = dc0Var.f16959p;
        } else if (qn4Var == qn4.f28625b) {
            jM6741a = BlendKt.m13914blendjxsXWHM(dc0Var.f16962s, mz3.f25345b, 0.2f);
        } else {
            jM6741a = qn4Var == qn4.f28626c ? dc0Var.f16962s : ic0.m6741a(dc0Var, j3);
        }
        long j4 = jM6741a;
        if (z) {
            j = j4;
        } else {
            if (qn4Var == qn4.f28627d) {
                j2 = dc0Var.f16942b;
            } else if (qn4Var == qn4.f28626c) {
                j2 = dc0Var.f16953j;
            } else {
                j = j4;
            }
            j = j2;
        }
        return new xy3(j3, j4, j, pb0.m9464c(j, 0.74f, 0.0f, 0.0f, 0.0f, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (p000.zt5.m13784o(r9, r1, p000.z62.m13387o(r7, r2) ? r0.getWidth() : p000.AbstractC0707h.m6201d(r7.f19640a, r8), p000.z62.m13387o(r7, r2) ? r0.getHeight() : p000.AbstractC0707h.m6201d(r7.f19641b, r8), r8) == 1.0d) goto L24;
     */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap m10823s(Drawable drawable, Bitmap.Config config, g74 g74Var, qv3 qv3Var, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap3.getConfig() == ((config == null || config == Bitmap.Config.HARDWARE) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    g74 g74Var2 = g74.f19639c;
                }
                return bitmap3;
            }
        }
        Drawable drawableMutate = drawable.mutate();
        Bitmap.Config[] configArr = AbstractC0707h.f20231a;
        boolean z2 = drawableMutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z2 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? drawableMutate.getIntrinsicWidth() : bitmap2.getWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z2 ? (BitmapDrawable) drawableMutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? drawableMutate.getIntrinsicHeight() : bitmap.getHeight();
        int i = intrinsicHeight > 0 ? intrinsicHeight : 512;
        g74 g74Var3 = g74.f19639c;
        double dM13784o = zt5.m13784o(intrinsicWidth, i, z62.m13387o(g74Var, g74Var3) ? intrinsicWidth : AbstractC0707h.m6201d(g74Var.f19640a, qv3Var), z62.m13387o(g74Var, g74Var3) ? i : AbstractC0707h.m6201d(g74Var.f19641b, qv3Var), qv3Var);
        int iM10009D = qq2.m10009D(((double) intrinsicWidth) * dM13784o);
        int iM10009D2 = qq2.m10009D(dM13784o * ((double) i));
        if (config == null || config == Bitmap.Config.HARDWARE) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM10009D, iM10009D2, config);
        Rect bounds = drawableMutate.getBounds();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iM10009D, iM10009D2);
        drawableMutate.draw(new Canvas(bitmapCreateBitmap));
        drawableMutate.setBounds(i2, i3, i4, i5);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: t */
    public static final AbstractC0654fk m10824t(AbstractC0654fk abstractC0654fk) {
        AbstractC0654fk abstractC0654fkMo4035c = abstractC0654fk.mo4035c();
        int iMo4034b = abstractC0654fkMo4035c.mo4034b();
        for (int i = 0; i < iMo4034b; i++) {
            abstractC0654fkMo4035c.mo3610e(abstractC0654fk.mo3608a(i), i);
        }
        return abstractC0654fkMo4035c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final Object m10825u(bj0 bj0Var, xh3 xh3Var) {
        if (!((mt2) bj0Var).f25195a.f25208n) {
            q32.m9721c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        ga3 ga3Var = (ga3) sc6.m10652X(bj0Var).f33295C;
        ga3Var.getClass();
        return i25.m6603B(ga3Var, xh3Var);
    }

    /* JADX INFO: renamed from: v */
    public static void m10826v(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            qf0 qf0Var = (qf0) obj;
            os0 os0Var = new os0();
            os0Var.f27052b = new HashSet();
            os0Var.f27053c = new HashSet();
            os0Var.f27051a = qf0Var;
            VarHandle.storeStoreFence();
            for (ni3 ni3Var : qf0Var.f28429b) {
                boolean z = qf0Var.f28432e;
                ps0 ps0Var = new ps0(ni3Var, z);
                if (!map.containsKey(ps0Var)) {
                    map.put(ps0Var, new HashSet());
                }
                Set set = (Set) map.get(ps0Var);
                if (!set.isEmpty() && !z) {
                    xy4.m12789r("Multiple components provide ", ni3Var, ".");
                    return;
                }
                set.add(os0Var);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (os0 os0Var2 : (Set) it.next()) {
                for (ny0 ny0Var : os0Var2.f27051a.f28430c) {
                    if (ny0Var.f26190c == 0) {
                        Set<os0> set2 = (Set) map.get(new ps0(ny0Var.f26188a, ny0Var.f26189b == 2));
                        if (set2 != null) {
                            for (os0 os0Var3 : set2) {
                                os0Var2.f27052b.add(os0Var3);
                                os0Var3.f27053c.add(os0Var2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<os0> hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        for (os0 os0Var4 : hashSet) {
            if (os0Var4.f27053c.isEmpty()) {
                hashSet2.add(os0Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            os0 os0Var5 = (os0) hashSet2.iterator().next();
            hashSet2.remove(os0Var5);
            i++;
            for (os0 os0Var6 : os0Var5.f27052b) {
                os0Var6.f27053c.remove(os0Var5);
                if (os0Var6.f27053c.isEmpty()) {
                    hashSet2.add(os0Var6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (os0 os0Var7 : hashSet) {
            if (!os0Var7.f27053c.isEmpty() && !os0Var7.f27052b.isEmpty()) {
                arrayList2.add(os0Var7.f27051a);
            }
        }
        throw new py0("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m10827w(Context context, int i) {
        if (m10801J(context, i, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                zt1 zt1VarM13748a = zt1.m13748a(context);
                if (packageInfo != null) {
                    if (!zt1.m13749c(packageInfo, false)) {
                        if (zt1.m13749c(packageInfo, true)) {
                            if (!yt1.m13236b((Context) zt1VarM13748a.f36356a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m10828x(wu0 wu0Var, int i, int i2) {
        if (i > i2 && wu0Var.f33735g) {
            return false;
        }
        Set set = wu0Var.f33736h;
        return wu0Var.f33734f && (set == null || !set.contains(Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: y */
    public static final nt2 m10829y(nt2 nt2Var, nq1 nq1Var) {
        ef2 ef2Var = new ef2();
        ef2Var.f18050a = nq1Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(ef2Var);
    }

    /* JADX INFO: renamed from: z */
    public static uv1 m10830z(String... strArr) {
        if (strArr.length % 2 != 0) {
            C1077qn.m9987m("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                C1077qn.m9987m("Headers cannot be null");
                return null;
            }
            strArr2[i2] = hd4.m6360z0(str).toString();
        }
        int iM7619t = ks5.m7619t(0, strArr2.length - 1, 2);
        if (iM7619t >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                m10817m(str2);
                m10818n(str3, str2);
                if (i == iM7619t) {
                    break;
                }
                i += 2;
            }
        }
        return new uv1(strArr2);
    }
}
