package p000;

import ads_mobile_sdk.k72;
import ads_mobile_sdk.su1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class vd6 {

    /* JADX INFO: renamed from: a */
    public static volatile y53 f32538a;

    /* JADX INFO: renamed from: b */
    public static final Object f32539b = new Object();

    /* JADX INFO: renamed from: c */
    public static final pg0 f32540c = new pg0(-574899127, false, new xg0(20));

    /* JADX INFO: renamed from: d */
    public static final StackTraceElement[] f32541d = new StackTraceElement[0];

    /* JADX INFO: renamed from: e */
    public static final z45 f32542e = new z45(18);

    /* JADX INFO: renamed from: f */
    public static final String[] f32543f = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* JADX INFO: renamed from: g */
    public static final String[] f32544g = {"ad_impression"};

    /* JADX INFO: renamed from: h */
    public static final String[] f32545h = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* JADX INFO: renamed from: i */
    public static final String[] f32546i = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* JADX INFO: renamed from: j */
    public static g12 f32547j;

    /* JADX INFO: renamed from: A */
    public static final long m11817A(int i) {
        return m11825I(4294967296L, i);
    }

    /* JADX INFO: renamed from: B */
    public static final String m11818B(int i, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14650a);
        return ((Resources) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14652c)).getString(i);
    }

    /* JADX INFO: renamed from: C */
    public static final int m11819C(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m11820D(i14 i14Var, Resources resources) {
        if (C0006a5.m87y(i14Var)) {
            return false;
        }
        e14 e14Var = i14Var.f21012d;
        if (e14Var.f17633c) {
            return true;
        }
        Object objM8132g = e14Var.f17631a.m8132g(m14.f24552a);
        if (objM8132g == null) {
            objM8132g = null;
        }
        List list = (List) objM8132g;
        return !((list != null ? (String) hb0.m6301M0(list) : null) == null && m11866y(i14Var) == null && m11865x(i14Var, resources) == null && !m11864w(i14Var)) && m11821E(i14Var);
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m11821E(i14 i14Var) {
        if (!i14Var.m6552n()) {
            List listM6548i = i14Var.m6548i((4 & 1) != 0 ? !i14Var.f21010b : false, (4 & 2) == 0);
            int size = listM6548i.size();
            for (int i = 0; i < size; i++) {
                if (zt5.m13757B((i14) listM6548i.get(i))) {
                }
            }
            wf2 wf2VarM12295v = i14Var.f21011c.m12295v();
            while (true) {
                if (wf2VarM12295v == null) {
                    wf2VarM12295v = null;
                    break;
                }
                e14 e14VarM12297x = wf2VarM12295v.m12297x();
                if (e14VarM12297x != null && e14VarM12297x.f17633c) {
                    break;
                }
                wf2VarM12295v = wf2VarM12295v.m12295v();
            }
            return !(wf2VarM12295v != null);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public static final Object m11822F(List list, ym0 ym0Var) {
        C1011ov c1011ov;
        Iterator it;
        int i;
        if (ym0Var instanceof C1011ov) {
            c1011ov = (C1011ov) ym0Var;
            int i2 = c1011ov.f27147w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1011ov.f27147w = i2 - Integer.MIN_VALUE;
            } else {
                c1011ov = new C1011ov(ym0Var);
            }
        } else {
            c1011ov = new C1011ov(ym0Var);
        }
        Object obj = c1011ov.f27146v;
        ap0 ap0Var = ap0.f14763a;
        int i3 = c1011ov.f27147w;
        if (i3 == 0) {
            k43.m7376J(obj);
            it = list.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c1011ov.f27145u;
            it = c1011ov.f27144t;
            k43.m7376J(obj);
        }
        while (it.hasNext()) {
            t82 t82Var = (t82) it.next();
            c1011ov.f27144t = it;
            c1011ov.f27145u = i;
            c1011ov.f27147w = 1;
            if (t82Var.mo5005t(c1011ov) == ap0Var) {
                return ap0Var;
            }
        }
        return ju4.f22634a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static final so0 m11823G(so0 so0Var, String str) {
        if (str == null) {
            return so0Var;
        }
        ix2 ix2Var = new ix2();
        mx0 mx0Var = so0Var instanceof mx0 ? (mx0) so0Var : null;
        if (mx0Var == null) {
            mx0Var = yv0.f35546a;
        }
        ix2Var.f21858b = mx0Var;
        ix2Var.f21859c = so0Var;
        ix2Var.f21860d = str;
        VarHandle.storeStoreFence();
        return ix2Var;
    }

    /* JADX INFO: renamed from: H */
    public static final nt2 m11824H(nt2 nt2Var, yp1 yp1Var) {
        d33 d33Var = new d33();
        d33Var.f16761a = yp1Var;
        d33Var.f16762b = true;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(d33Var);
    }

    /* JADX INFO: renamed from: I */
    public static final long m11825I(long j, float f) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        cm4[] cm4VarArr = bm4.f15418b;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0068 A[EDGE_INSN: B:109:0x0068->B:22:0x0068 BREAK  A[LOOP:2: B:16:0x004a->B:20:0x005b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b A[LOOP:2: B:16:0x004a->B:20:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x014c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:75:0x016a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:0x019a  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    /* JADX INFO: renamed from: J */
    public static x50 m11826J(uv1 uv1Var) {
        int i;
        int length;
        boolean z;
        int length2;
        int i2;
        String string;
        String string2;
        uv1 uv1Var2 = uv1Var;
        int size = uv1Var2.size();
        boolean z2 = true;
        boolean z3 = true;
        int i3 = 0;
        String str = null;
        boolean z4 = false;
        boolean z5 = false;
        int iM13828w = -1;
        int iM13828w2 = -1;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int iM13828w3 = -1;
        int iM13828w4 = -1;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (i3 < size) {
            String strM11658b = uv1Var2.m11658b(i3);
            String strM11660d = uv1Var2.m11660d(i3);
            if (od4.m9039T(strM11658b, "Cache-Control", z2)) {
                if (str == null) {
                    str = strM11660d;
                }
                i = 0;
                while (i < strM11660d.length()) {
                    length = strM11660d.length();
                    z = z2;
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strM11660d.length();
                            break;
                        }
                        i2 = size;
                        if (hd4.m6336b0("=,;", strM11660d.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = hd4.m6360z0(strM11660d.substring(i, length2)).toString();
                    if (length2 != strM11660d.length() || strM11660d.charAt(length2) == ',' || strM11660d.charAt(length2) == ';') {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = zv4.f36415a;
                        int length4 = strM11660d.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strM11660d.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strM11660d.length();
                                break;
                            }
                        }
                        if (length3 >= strM11660d.length() || strM11660d.charAt(length3) != '\"') {
                            int length5 = strM11660d.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strM11660d.length();
                                    break;
                                }
                                int i4 = length5;
                                if (hd4.m6336b0(",;", strM11660d.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i4;
                            }
                            int i5 = length6;
                            string2 = hd4.m6360z0(strM11660d.substring(length3, length6)).toString();
                            i = i5;
                        } else {
                            int i6 = length3 + 1;
                            int iM6342h0 = hd4.m6342h0(strM11660d, '\"', i6, 4);
                            string2 = strM11660d.substring(i6, iM6342h0);
                            i = iM6342h0 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = z;
                        z4 = z2;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z2 = z;
                        z5 = z2;
                    } else {
                        if ("max-age".equalsIgnoreCase(string)) {
                            iM13828w = zv4.m13828w(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iM13828w2 = zv4.m13828w(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z2 = z;
                            z6 = z2;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z2 = z;
                            z7 = z2;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z2 = z;
                            z8 = z2;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iM13828w3 = zv4.m13828w(Integer.MAX_VALUE, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iM13828w4 = zv4.m13828w(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z2 = z;
                            z9 = z2;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z2 = z;
                            z10 = z2;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z2 = z;
                            z11 = z2;
                        }
                        z2 = z;
                    }
                    size = i2;
                }
                i3++;
                uv1Var2 = uv1Var;
                z2 = z2;
                size = size;
            } else {
                if (od4.m9039T(strM11658b, "Pragma", z2)) {
                }
                i3++;
                uv1Var2 = uv1Var;
                z2 = z2;
                size = size;
            }
            z3 = false;
            i = 0;
            while (i < strM11660d.length()) {
                length = strM11660d.length();
                z = z2;
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        i2 = size;
                        length2 = strM11660d.length();
                        break;
                    }
                    i2 = size;
                    if (hd4.m6336b0("=,;", strM11660d.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i2;
                }
                string = hd4.m6360z0(strM11660d.substring(i, length2)).toString();
                if (length2 != strM11660d.length()) {
                    i = length2 + 1;
                    string2 = null;
                } else {
                    i = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = z;
                    z4 = z2;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z2 = z;
                    z5 = z2;
                } else {
                    if ("max-age".equalsIgnoreCase(string)) {
                        iM13828w = zv4.m13828w(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iM13828w2 = zv4.m13828w(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z2 = z;
                        z6 = z2;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z2 = z;
                        z7 = z2;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z2 = z;
                        z8 = z2;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iM13828w3 = zv4.m13828w(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iM13828w4 = zv4.m13828w(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z2 = z;
                        z9 = z2;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z2 = z;
                        z10 = z2;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z2 = z;
                        z11 = z2;
                    }
                    z2 = z;
                }
                size = i2;
            }
            i3++;
            uv1Var2 = uv1Var;
            z2 = z2;
            size = size;
        }
        return new x50(z4, z5, iM13828w, iM13828w2, z6, z7, z8, iM13828w3, iM13828w4, z9, z10, z11, !z3 ? null : str);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0082  */
    /* JADX INFO: renamed from: K */
    public static long m11827K(int i, String str) {
        int iM11856o = m11856o(str, 0, i, false);
        Matcher matcher = tn0.f31246m.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iM6343i0 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iM11856o < i) {
            int iM11856o2 = m11856o(str, iM11856o + 1, i, true);
            matcher.region(iM11856o, iM11856o2);
            if (i3 == -1 && matcher.usePattern(tn0.f31246m).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i5 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(tn0.f31245l).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iM6343i0 == -1) {
                Pattern pattern = tn0.f31244k;
                if (matcher.usePattern(pattern).matches()) {
                    iM6343i0 = hd4.m6343i0(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(tn0.f31243j).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else if (i2 != -1) {
            }
            iM11856o = m11856o(str, iM11856o2 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            C1077qn.m9987m("Failed requirement.");
            return 0L;
        }
        if (iM6343i0 == -1) {
            C1077qn.m9987m("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            C1077qn.m9987m("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            C1077qn.m9987m("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            C1077qn.m9987m("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            C1077qn.m9987m("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(zv4.f36419e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iM6343i0 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: L */
    public static vn2 m11828L() {
        vn2 vn2Var = new vn2();
        te0 te0Var = new te0();
        VarHandle.storeStoreFence();
        vn2Var.f32748a = te0Var;
        VarHandle.storeStoreFence();
        return vn2Var;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m11829M(Parcel parcel, int i) {
        m11840X(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: N */
    public static IBinder m11830N(Parcel parcel, int i) {
        int iM11833Q = m11833Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM11833Q == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM11833Q);
        return strongBinder;
    }

    /* JADX INFO: renamed from: O */
    public static int m11831O(Parcel parcel, int i) {
        m11840X(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: P */
    public static long m11832P(Parcel parcel, int i) {
        m11840X(parcel, i, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: Q */
    public static int m11833Q(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: R */
    public static final pg0 m11834R(int i, iq1 iq1Var, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        if (objM6869O == ki0.f23136a) {
            objM6869O = new pg0(i, true, iq1Var);
            ir1Var.m6905n0(objM6869O);
        }
        pg0 pg0Var = (pg0) objM6869O;
        pg0Var.m9520l(iq1Var);
        return pg0Var;
    }

    /* JADX INFO: renamed from: S */
    public static final String m11835S(Object obj) {
        return zi4.m13621u(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    /* JADX INFO: renamed from: T */
    public static void m11836T(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m11833Q(parcel, i));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX INFO: renamed from: U */
    public static final Object m11837U(int i, Object obj, vt1 vt1Var, xm1 xm1Var, int i2) {
        boolean z;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z2 = false;
        if ((i & 1) == 0 || z62.m13387o(vt1Var.f32856e, xm1Var)) {
            z = false;
        } else {
            xm1 xm1Var2 = xm1.f34411d;
            if (xm1Var.compareTo(xm1Var2) < 0 || z62.m13393u(vt1Var.f32856e.f34418a, xm1Var2.f34418a) >= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z3 = ((i & 2) == 0 || i2 == vt1Var.f32857f) ? false : true;
        if (!z3 && !z) {
            return obj;
        }
        int i3 = z ? xm1Var.f34418a : vt1Var.f32856e.f34418a;
        if (!z3 ? vt1Var.f32857f : i2 == 1) {
            z2 = true;
        }
        return Typeface.create((Typeface) obj, i3, z2);
    }

    /* JADX INFO: renamed from: V */
    public static final int m11838V(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    /* JADX INFO: renamed from: W */
    public static int m11839W(Parcel parcel) {
        int i = parcel.readInt();
        int iM11833Q = m11833Q(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new cu3("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iM11833Q + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new cu3(sb.toString(), parcel);
    }

    /* JADX INFO: renamed from: X */
    public static void m11840X(Parcel parcel, int i, int i2) {
        int iM11833Q = m11833Q(parcel, i);
        if (iM11833Q == i2) {
            return;
        }
        String hexString = Integer.toHexString(iM11833Q);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iM11833Q).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iM11833Q);
        throw new cu3(c75.m3881m(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: Y */
    public static void m11841Y(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new cu3(c75.m3881m(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: a */
    public static final void m11842a(pk4 pk4Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        nt2 nt2VarM12900I;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1533506138);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(pk4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 32 : 16;
        }
        byte b2 = 0;
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            ir1Var.m6885d0(-885604480);
            if (pk4Var.m9547i()) {
                wm0 wm0Var = null;
                nt2 nt2VarM5657O = AbstractC0647fd.m5657O(new mn3(pk4Var, null));
                yg3 yg3Var = pk4Var.f27716x;
                ik4 ik4Var = new ik4(pk4Var, wm0Var, b2);
                jk4 jk4Var = new jk4(pk4Var, wm0Var, b2);
                eo0 eo0Var = new eo0(b);
                eo0Var.f18287b = pk4Var;
                VarHandle.storeStoreFence();
                nt2VarM12900I = AbstractC1356y5.m12900I(nt2VarM5657O, yg3Var, ik4Var, jk4Var, eo0Var);
            } else {
                nt2VarM12900I = kt2.f23428a;
            }
            zc6.m13525j(nt2VarM12900I, pg0Var, ir1Var, i2 & 112);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yd0 yd0Var = new yd0(b2);
            yd0Var.f35123b = pk4Var;
            yd0Var.f35124c = pg0Var;
            yd0Var.f35125d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = yd0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Integer m11843b(wa2 wa2Var, String str) {
        int i = k72.f6100h;
        try {
            wa2 wa2VarM2262a = su1.m2262a(wa2Var, str, (wa2) null);
            if (wa2VarM2262a != null) {
                return Integer.valueOf(Color.rgb(wa2VarM2262a.m12186z("r").mo3526e(), wa2VarM2262a.m12186z("g").mo3526e(), wa2VarM2262a.m12186z("b").mo3526e()));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m11844c(Context context, FrameLayout frameLayout, String str) {
        DisplayMetrics displayMetrics;
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            frameLayout.setBackground(bitmapDrawable);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object m11845d(List list, ym0 ym0Var) {
        if (list.isEmpty()) {
            return v71.f32439a;
        }
        hx0[] hx0VarArr = (hx0[]) list.toArray(new hx0[0]);
        C0886lv c0886lv = new C0886lv(hx0VarArr);
        b70 b70Var = new b70(1, C0006a5.m86x(ym0Var));
        b70Var.m3497u();
        int length = hx0VarArr.length;
        C0812jv[] c0812jvArr = new C0812jv[length];
        for (int i = 0; i < length; i++) {
            hx0 hx0Var = hx0VarArr[i];
            hx0Var.start();
            C0812jv c0812jv = new C0812jv(c0886lv, b70Var);
            c0812jv.f22639f = y70.m13005F(hx0Var, true, c0812jv);
            c0812jvArr[i] = c0812jv;
        }
        C0849kv c0849kv = new C0849kv();
        c0849kv.f23528a = c0812jvArr;
        VarHandle.storeStoreFence();
        for (int i2 = 0; i2 < length; i2++) {
            C0812jv c0812jv2 = c0812jvArr[i2];
            c0812jv2.getClass();
            AbstractC1078qo.f28633a.putObjectVolatile(c0812jv2, C0812jv.f22637h, c0849kv);
        }
        if (b70Var.m3496t() instanceof s13) {
            b70Var.m3500x(c0849kv);
        } else {
            c0849kv.m7632a();
        }
        Object objM3495r = b70Var.m3495r();
        ap0 ap0Var = ap0.f14763a;
        return objM3495r;
    }

    /* JADX INFO: renamed from: e */
    public static final int m11846e(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* JADX INFO: renamed from: f */
    public static t34 m11847f(t34 t34Var) {
        sp2 sp2Var = t34Var.f30744a;
        sp2Var.m10893b();
        return sp2Var.f30468i > 0 ? t34Var : t34.f30743b;
    }

    /* JADX INFO: renamed from: g */
    public static final void m11848g(int i) {
        if (i >= 1) {
            return;
        }
        C1077qn.m9988n(c75.m3877i(i, "Expected positive parallelism level, but got "));
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m11849h(Parcel parcel, int i) {
        int iM11833Q = m11833Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM11833Q == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM11833Q);
        return bundle;
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m11850i(Parcel parcel, int i) {
        int iM11833Q = m11833Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM11833Q == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM11833Q);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: j */
    public static p03 m11851j(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                wn2 wn2VarM12326e = wn2.m12326e();
                String str = p03.f27260b;
                wn2VarM12326e.m12333i(p03.f27260b, c75.m3878j("Ignoring adding capability '", i, "'"), e);
            }
        }
        int[] iArr3 = zc6.f35987e;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!AbstractC0990oo.m9196Q(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    wn2 wn2VarM12326e2 = wn2.m12326e();
                    String str2 = p03.f27260b;
                    wn2VarM12326e2.m12333i(p03.f27260b, c75.m3878j("Ignoring removing default capability '", i3, "'"), e2);
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        return new p03(builder.build());
    }

    /* JADX INFO: renamed from: k */
    public static Parcelable m11852k(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM11833Q = m11833Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM11833Q == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM11833Q);
        return parcelable;
    }

    /* JADX INFO: renamed from: l */
    public static String m11853l(Parcel parcel, int i) {
        int iM11833Q = m11833Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM11833Q == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM11833Q);
        return string;
    }

    /* JADX INFO: renamed from: m */
    public static Object[] m11854m(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM11833Q = m11833Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM11833Q == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM11833Q);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: renamed from: n */
    public static ArrayList m11855n(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM11833Q = m11833Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM11833Q == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM11833Q);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: o */
    public static int m11856o(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m11857p(i14 i14Var) {
        return !i14Var.m6549k().f17631a.m8128c(m14.f24561j);
    }

    /* JADX INFO: renamed from: q */
    public static void m11858q(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new cu3(sb.toString(), parcel);
    }

    /* JADX INFO: renamed from: r */
    public static final v91 m11859r(Enum[] enumArr) {
        v91 v91Var = new v91();
        v91Var.f32476a = enumArr;
        VarHandle.storeStoreFence();
        return v91Var;
    }

    /* JADX INFO: renamed from: s */
    public static final nt2 m11860s(nt2 nt2Var, boolean z, nv2 nv2Var) {
        nt2 nt2Var2;
        if (z) {
            wl1 wl1Var = new wl1();
            wl1Var.f33460a = nv2Var;
            VarHandle.storeStoreFence();
            nt2Var2 = wl1Var;
        } else {
            nt2Var2 = kt2.f23428a;
        }
        return nt2Var.mo7630d(nt2Var2);
    }

    /* JADX INFO: renamed from: t */
    public static final g12 m11861t() {
        g12 g12Var = f32547j;
        if (g12Var != null) {
            return g12Var;
        }
        f12 f12Var = new f12("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = uw4.f32218a;
        ga4 ga4Var = new ga4(pb0.f27495b);
        tv1 tv1Var = new tv1((byte) 1);
        tv1Var.m11175k(6.0f, 19.0f);
        tv1Var.m11170f(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        tv1Var.m11172h(8.0f);
        tv1Var.m11170f(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        j93 j93Var = new j93(7.0f);
        ArrayList arrayList = tv1Var.f31466a;
        arrayList.add(j93Var);
        tv1Var.m11171g(6.0f);
        tv1Var.m11180p(12.0f);
        tv1Var.m11168d();
        tv1Var.m11175k(19.0f, 4.0f);
        tv1Var.m11172h(-3.5f);
        tv1Var.m11174j(-1.0f, -1.0f);
        tv1Var.m11172h(-5.0f);
        tv1Var.m11174j(-1.0f, 1.0f);
        tv1Var.m11171g(5.0f);
        tv1Var.m11180p(2.0f);
        tv1Var.m11172h(14.0f);
        arrayList.add(new j93(4.0f));
        tv1Var.m11168d();
        f12.m5445c(f12Var, arrayList, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
        g12 g12VarM5449e = f12Var.m5449e();
        f32547j = g12VarM5449e;
        return g12VarM5449e;
    }

    /* JADX INFO: renamed from: u */
    public static final float m11862u(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = ll4.f24138a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : f22.f18672a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX INFO: renamed from: v */
    public static final float m11863v(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = ll4.f24138a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? f22.f18672a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m11864w(i14 i14Var) {
        Object objM8132g = i14Var.f21012d.f17631a.m8132g(m14.f24544K);
        if (objM8132g == null) {
            objM8132g = null;
        }
        ln4 ln4Var = (ln4) objM8132g;
        lw2 lw2Var = i14Var.f21012d.f17631a;
        Object objM8132g2 = lw2Var.m8132g(m14.f24576y);
        if (objM8132g2 == null) {
            objM8132g2 = null;
        }
        lq3 lq3Var = (lq3) objM8132g2;
        boolean z = ln4Var != null;
        Object objM8132g3 = lw2Var.m8132g(m14.f24543J);
        if (((Boolean) (objM8132g3 != null ? objM8132g3 : null)) == null || (lq3Var != null && lq3Var.f24281a == 4)) {
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public static final String m11865x(i14 i14Var, Resources resources) {
        int iM10675p;
        e14 e14Var = i14Var.f21012d;
        e14 e14Var2 = i14Var.f21012d;
        Object objM8132g = e14Var.f17631a.m8132g(m14.f24553b);
        String string = null;
        if (objM8132g == null) {
            objM8132g = null;
        }
        lw2 lw2Var = e14Var2.f17631a;
        Object objM8132g2 = lw2Var.m8132g(m14.f24544K);
        if (objM8132g2 == null) {
            objM8132g2 = null;
        }
        ln4 ln4Var = (ln4) objM8132g2;
        Object objM8132g3 = lw2Var.m8132g(m14.f24576y);
        if (objM8132g3 == null) {
            objM8132g3 = null;
        }
        lq3 lq3Var = (lq3) objM8132g3;
        if (ln4Var != null) {
            int iOrdinal = ln4Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C0670g.m5864c();
                        return null;
                    }
                    if (objM8132g == null) {
                        objM8132g = resources.getString(C0995R.string.indeterminate);
                    }
                } else if (lq3Var != null && lq3Var.f24281a == 2 && objM8132g == null) {
                    objM8132g = resources.getString(C0995R.string.state_off);
                }
            } else if (lq3Var != null && lq3Var.f24281a == 2 && objM8132g == null) {
                objM8132g = resources.getString(C0995R.string.state_on);
            }
        }
        Object objM8132g4 = lw2Var.m8132g(m14.f24543J);
        if (objM8132g4 == null) {
            objM8132g4 = null;
        }
        Boolean bool = (Boolean) objM8132g4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((lq3Var == null || lq3Var.f24281a != 4) && objM8132g == null) {
                objM8132g = zBooleanValue ? resources.getString(C0995R.string.selected) : resources.getString(C0995R.string.not_selected);
            }
        }
        Object objM8132g5 = lw2Var.m8132g(m14.f24554c);
        if (objM8132g5 == null) {
            objM8132g5 = null;
        }
        bh3 bh3Var = (bh3) objM8132g5;
        if (bh3Var != null) {
            if (bh3Var != bh3.f15270c) {
                if (objM8132g == null) {
                    ma0 ma0Var = bh3Var.f15272b;
                    float f = ma0Var.f24779b;
                    float f2 = ma0Var.f24778a;
                    float f3 = f - f2 == 0.0f ? 0.0f : (bh3Var.f15271a - f2) / (f - f2);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    if (f3 == 0.0f) {
                        iM10675p = 0;
                    } else {
                        iM10675p = f3 == 1.0f ? 100 : sc6.m10675p(Math.round(f3 * 100.0f), 1, 99);
                    }
                    objM8132g = resources.getString(C0995R.string.template_percent, Integer.valueOf(iM10675p));
                }
            } else if (objM8132g == null) {
                objM8132g = resources.getString(C0995R.string.in_progress);
            }
        }
        p14 p14Var = m14.f24539F;
        if (lw2Var.m8128c(p14Var)) {
            lw2 lw2Var2 = new i14(i14Var.f21009a, true, i14Var.f21011c, e14Var2).m6549k().f17631a;
            Object objM8132g6 = lw2Var2.m8132g(m14.f24552a);
            if (objM8132g6 == null) {
                objM8132g6 = null;
            }
            Collection collection = (Collection) objM8132g6;
            if (collection == null || collection.isEmpty()) {
                Object objM8132g7 = lw2Var2.m8132g(m14.f24535B);
                if (objM8132g7 == null) {
                    objM8132g7 = null;
                }
                Collection collection2 = (Collection) objM8132g7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objM8132g8 = lw2Var2.m8132g(p14Var);
                    if (objM8132g8 == null) {
                        objM8132g8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objM8132g8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(C0995R.string.state_empty);
                    }
                }
            }
            objM8132g = string;
        }
        return (String) objM8132g;
    }

    /* JADX INFO: renamed from: y */
    public static final C0875lk m11866y(i14 i14Var) {
        Object objM8132g = i14Var.f21012d.f17631a.m8132g(m14.f24539F);
        if (objM8132g == null) {
            objM8132g = null;
        }
        C0875lk c0875lk = (C0875lk) objM8132g;
        Object objM8132g2 = i14Var.f21012d.f17631a.m8132g(m14.f24535B);
        if (objM8132g2 == null) {
            objM8132g2 = null;
        }
        List list = (List) objM8132g2;
        return c0875lk == null ? list != null ? (C0875lk) hb0.m6301M0(list) : null : c0875lk;
    }

    /* JADX INFO: renamed from: z */
    public static final long m11867z(double d) {
        return m11825I(4294967296L, (float) d);
    }
}
