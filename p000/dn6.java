package p000;

import android.adservices.measurement.MeasurementManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dn6 extends lc6 {

    /* JADX INFO: renamed from: m */
    public static final String[] f17221m = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: n */
    public static final String[] f17222n = {"_err"};

    /* JADX INFO: renamed from: g */
    public SecureRandom f17223g;

    /* JADX INFO: renamed from: h */
    public AtomicLong f17224h;

    /* JADX INFO: renamed from: i */
    public int f17225i;

    /* JADX INFO: renamed from: j */
    public fr2 f17226j;

    /* JADX INFO: renamed from: k */
    public Boolean f17227k;

    /* JADX INFO: renamed from: l */
    public Integer f17228l;

    /* JADX INFO: renamed from: D0 */
    public static boolean m4563D0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: renamed from: K */
    public static void m4564K(bn6 bn6Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m4575n0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        bn6Var.mo3640a(str, "_err", bundle);
    }

    /* JADX INFO: renamed from: L */
    public static MessageDigest m4565L() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static long m4566M(byte[] bArr) {
        y42.m12854a0(bArr);
        int length = bArr.length;
        long j = 0;
        if (length <= 0) {
            xy4.m12787p();
            return 0L;
        }
        int i = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    /* JADX INFO: renamed from: N */
    public static boolean m4567N(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m4568Q(String str) {
        String str2 = (String) e56.f17814r0.m4379a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    /* JADX INFO: renamed from: S */
    public static boolean m4569S(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: renamed from: T */
    public static boolean m4570T(String str, String[] strArr) {
        y42.m12854a0(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    public static byte[] m4571Y(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static ArrayList m4572j0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yo5 yo5Var = (yo5) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", yo5Var.f35432d);
            bundle.putString("origin", yo5Var.f35433e);
            bundle.putLong("creation_timestamp", yo5Var.f35435g);
            bundle.putString("name", yo5Var.f35434f.f34428e);
            Object objM12714f = yo5Var.f35434f.m12714f();
            y42.m12854a0(objM12714f);
            qu5.m10126b(bundle, objM12714f);
            bundle.putBoolean("active", yo5Var.f35436h);
            String str = yo5Var.f35437i;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            ys5 ys5Var = yo5Var.f35438j;
            if (ys5Var != null) {
                bundle.putString("timed_out_event_name", ys5Var.f35504d);
                os5 os5Var = ys5Var.f35505e;
                if (os5Var != null) {
                    bundle.putBundle("timed_out_event_params", os5Var.m9261d());
                }
            }
            bundle.putLong("trigger_timeout", yo5Var.f35439k);
            ys5 ys5Var2 = yo5Var.f35440l;
            if (ys5Var2 != null) {
                bundle.putString("triggered_event_name", ys5Var2.f35504d);
                os5 os5Var2 = ys5Var2.f35505e;
                if (os5Var2 != null) {
                    bundle.putBundle("triggered_event_params", os5Var2.m9261d());
                }
            }
            bundle.putLong("triggered_timestamp", yo5Var.f35434f.f34429f);
            bundle.putLong("time_to_live", yo5Var.f35441m);
            ys5 ys5Var3 = yo5Var.f35442n;
            if (ys5Var3 != null) {
                bundle.putString("expired_event_name", ys5Var3.f35504d);
                os5 os5Var3 = ys5Var3.f35505e;
                if (os5Var3 != null) {
                    bundle.putBundle("expired_event_params", os5Var3.m9261d());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m4573k0(Context context) {
        ActivityInfo receiverInfo;
        y42.m12854a0(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m4574l0(eh6 eh6Var, Bundle bundle, boolean z) {
        if (bundle != null && eh6Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = eh6Var.f18105a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = eh6Var.f18106b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", eh6Var.f18107c);
                return;
            }
            z = false;
        }
        if (bundle != null && eh6Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final boolean m4575n0(int i, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m4576t0(String str) {
        y42.m12851X(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: renamed from: z */
    public static String m4577z(String str, boolean z, int i) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z) {
                return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX INFO: renamed from: A */
    public final int m4578A(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int size;
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        int i2 = 0;
        if (!m4563D0(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!m4570T(str2, oh6.f26723Q)) {
                return 20;
            }
            oj6 oj6VarM9027n = oa6Var.m9027n();
            oj6VarM9027n.mo5038t();
            oj6VarM9027n.m9741u();
            if (oj6VarM9027n.m9133B()) {
                dn6 dn6Var = ((oa6) oj6VarM9027n.f36084a).f26517i;
                oa6.m9014j(dn6Var);
                if (dn6Var.m4601a0() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16840o.m12507d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i = 0;
            }
        }
        int iMax = 500;
        if (m4569S(str) || m4569S(str2)) {
            oa6Var.f26512d.getClass();
            iMax = Math.max(500, 256);
        } else {
            oa6Var.f26512d.getClass();
        }
        if (!m4586E0("param", str2, iMax, obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                m4588F0(str, str2, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i2 < length) {
                    Parcelable parcelable = parcelableArr2[i2];
                    if (!(parcelable instanceof Bundle)) {
                        d76 d76Var2 = oa6Var.f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16840o.m12506c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return 4;
                    }
                    m4588F0(str, str2, (Bundle) parcelable, list, z);
                    i2++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    if (!(obj2 instanceof Bundle)) {
                        d76 d76Var3 = oa6Var.f26514f;
                        oa6.m9016l(d76Var3);
                        d76Var3.f16840o.m12506c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                        return 4;
                    }
                    m4588F0(str, str2, (Bundle) obj2, list, z);
                    i2++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: A0 */
    public final int m4579A0(String str) {
        if (!m4618w0("user property", str)) {
            return 6;
        }
        if (!m4619x0("user property", gq6.f20049n, null, str)) {
            return 15;
        }
        op5 op5Var = ((oa6) this.f36084a).f26512d;
        return !m4621y0("user property", 24, str) ? 6 : 0;
    }

    /* JADX INFO: renamed from: B */
    public final Object m4580B(Object obj, String str) {
        oa6 oa6Var = (oa6) this.f36084a;
        int iMax = 500;
        if ("_ev".equals(str)) {
            oa6Var.f26512d.getClass();
            return m4611o0(Math.max(500, 256), obj, true, true);
        }
        if (m4569S(str)) {
            oa6Var.f26512d.getClass();
            iMax = Math.max(500, 256);
        } else {
            oa6Var.f26512d.getClass();
        }
        return m4611o0(iMax, obj, false, true);
    }

    /* JADX INFO: renamed from: B0 */
    public final int m4581B0(String str) {
        if (!m4617v0("event param", str)) {
            return 3;
        }
        if (!m4619x0("event param", null, null, str)) {
            return 14;
        }
        op5 op5Var = ((oa6) this.f36084a).f26512d;
        return !m4621y0("event param", 40, str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: C */
    public final Bundle m4582C(String str, Bundle bundle, List list, boolean z) {
        int iM4581B0;
        list = list;
        boolean zM4570T = m4570T(str, vd6.f32546i);
        String str2 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        oa6 oa6Var = (oa6) this.f36084a;
        op5 op5Var = oa6Var.f26512d;
        p66 p66Var = oa6Var.f26518j;
        dn6 dn6Var = ((oa6) op5Var.f36084a).f26517i;
        oa6.m9014j(dn6Var);
        int i = dn6Var.m4600Z(201500000) ? 100 : 25;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iM4581B0 = !z ? m4581B0(str3) : 0;
                if (iM4581B0 == 0) {
                    iM4581B0 = m4583C0(str3);
                }
            } else {
                iM4581B0 = 0;
            }
            if (iM4581B0 != 0) {
                m4589G(bundle2, iM4581B0, str3, iM4581B0 == 3 ? str3 : str2);
                bundle2.remove(str3);
            } else {
                int iM4578A = m4578A(str, str3, bundle.get(str3), bundle2, list, z, zM4570T);
                if (iM4578A == 17) {
                    m4589G(bundle2, 17, str3, Boolean.FALSE);
                } else if (iM4578A != 0 && !"_ev".equals(str3)) {
                    m4589G(bundle2, iM4578A, iM4578A == 21 ? str : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (m4576t0(str3)) {
                    i2++;
                    if (i2 > i) {
                        if (!oa6Var.f26512d.m9225E(str2, e56.f17786f1) || !z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String string = sb.toString();
                            d76 d76Var = oa6Var.f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16837l.m12506c(string, p66Var.m9366a(str), p66Var.m9370e(bundle));
                        }
                        m4575n0(5, bundle2);
                        bundle2.remove(str3);
                        z2 = true;
                        str2 = str2;
                    }
                }
            }
            str2 = str2;
            str2 = str2;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: C0 */
    public final int m4583C0(String str) {
        if (!m4618w0("event param", str)) {
            return 3;
        }
        if (!m4619x0("event param", null, null, str)) {
            return 14;
        }
        op5 op5Var = ((oa6) this.f36084a).f26512d;
        return !m4621y0("event param", 40, str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: D */
    public final void m4584D(g76 g76Var, int i) {
        Bundle bundle = (Bundle) g76Var.f19646e;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (m4576t0(str) && (i2 = i2 + 1) > i) {
                oa6 oa6Var = (oa6) this.f36084a;
                op5 op5Var = oa6Var.f26512d;
                p66 p66Var = oa6Var.f26518j;
                if (!op5Var.m9225E(null, e56.f17786f1) || !z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16837l.m12506c(string, p66Var.m9366a((String) g76Var.f19644c), p66Var.m9370e(bundle));
                    m4575n0(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m4585E(Parcelable[] parcelableArr, int i) {
        y42.m12854a0(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m4576t0(str) && !m4570T(str, oh6.f26724R) && (i2 = i2 + 1) > i) {
                    oa6 oa6Var = (oa6) this.f36084a;
                    op5 op5Var = oa6Var.f26512d;
                    p66 p66Var = oa6Var.f26518j;
                    if (!op5Var.m9225E(null, e56.f17786f1) || !z) {
                        d76 d76Var = oa6Var.f26514f;
                        oa6.m9016l(d76Var);
                        x66 x66Var = d76Var.f16837l;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        x66Var.m12506c(sb.toString(), p66Var.m9367b(str), p66Var.m9370e(bundle));
                    }
                    m4575n0(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m4586E0(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) <= i) {
            return true;
        }
        d76 d76Var = ((oa6) this.f36084a).f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16840o.m12507d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final void m4587F(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                dn6 dn6Var = ((oa6) this.f36084a).f26517i;
                oa6.m9014j(dn6Var);
                dn6Var.m4592J(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m4588F0(String str, String str2, Bundle bundle, List list, boolean z) {
        int iM4581B0;
        int iM4578A;
        list = list;
        oa6 oa6Var = (oa6) this.f36084a;
        op5 op5Var = oa6Var.f26512d;
        d76 d76Var = oa6Var.f26514f;
        p66 p66Var = oa6Var.f26518j;
        dn6 dn6Var = ((oa6) op5Var.f36084a).f26517i;
        oa6.m9014j(dn6Var);
        int i = true != dn6Var.m4600Z(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iM4581B0 = !z ? m4581B0(str3) : 0;
                if (iM4581B0 == 0) {
                    iM4581B0 = m4583C0(str3);
                }
            } else {
                iM4581B0 = 0;
            }
            if (iM4581B0 != 0) {
                m4589G(bundle, iM4581B0, str3, iM4581B0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (m4563D0(bundle.get(str3))) {
                    oa6.m9016l(d76Var);
                    d76Var.f16840o.m12507d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iM4578A = 22;
                } else {
                    iM4578A = m4578A(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iM4578A != 0 && !"_ev".equals(str3)) {
                    m4589G(bundle, iM4578A, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (m4576t0(str3) && !m4570T(str3, oh6.f26724R)) {
                    int i3 = i2 + 1;
                    if (!m4600Z(231100000)) {
                        oa6.m9016l(d76Var);
                        d76Var.f16837l.m12506c("Item array not supported on client's version of Google Play Services (Android Only)", p66Var.m9366a(str), p66Var.m9370e(bundle));
                        m4575n0(23, bundle);
                        bundle.remove(str3);
                    } else if (i3 > i) {
                        if (!oa6Var.f26512d.m9225E(null, e56.f17786f1) || !z2) {
                            oa6.m9016l(d76Var);
                            x66 x66Var = d76Var.f16837l;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            x66Var.m12506c(sb.toString(), p66Var.m9366a(str), p66Var.m9370e(bundle));
                        }
                        m4575n0(28, bundle);
                        bundle.remove(str3);
                        list = list;
                        i2 = i3;
                        z2 = true;
                    }
                    i2 = i3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m4589G(Bundle bundle, int i, String str, Object obj) {
        if (m4575n0(i, bundle)) {
            op5 op5Var = ((oa6) this.f36084a).f26512d;
            bundle.putString("_ev", m4577z(str, true, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final int m4590H(Object obj, String str) {
        return "_ldl".equals(str) ? m4586E0("user property referrer", str, m4612p0(str), obj) : m4586E0("user property", str, m4612p0(str), obj) ? 0 : 7;
    }

    /* JADX INFO: renamed from: I */
    public final Object m4591I(Object obj, String str) {
        return "_ldl".equals(str) ? m4611o0(m4612p0(str), obj, true, false) : m4611o0(m4612p0(str), obj, false, false);
    }

    /* JADX INFO: renamed from: J */
    public final void m4592J(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            oa6 oa6Var = (oa6) this.f36084a;
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16840o.m12506c("Not putting event parameter. Invalid value type. name, type", oa6Var.f26518j.m9367b(str), simpleName);
        }
    }

    /* JADX INFO: renamed from: O */
    public final fr2 m4593O() {
        dr2 dr2Var;
        fr2 fr2Var = this.f17226j;
        if (fr2Var != null) {
            return fr2Var;
        }
        Context context = ((oa6) this.f36084a).f26509a;
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        C0480b6 c0480b6 = C0480b6.f15099a;
        sb.append(c0480b6.m3459a());
        Log.d("MeasurementManager", sb.toString());
        fr2 fr2Var2 = null;
        if (c0480b6.m3459a() >= 5) {
            MeasurementManager measurementManagerM3701c = bv1.m3701c(context.getSystemService(bv1.m3716r()));
            dr2Var = new dr2();
            dr2Var.f20806a = measurementManagerM3701c;
            VarHandle.storeStoreFence();
        } else {
            dr2Var = null;
        }
        if (dr2Var != null) {
            fr2Var2 = new fr2();
            fr2Var2.f19235a = dr2Var;
            VarHandle.storeStoreFence();
        }
        this.f17226j = fr2Var2;
        return fr2Var2;
    }

    /* JADX INFO: renamed from: P */
    public final long m4594P() {
        long j;
        Object e;
        Integer num;
        mo5038t();
        oa6 oa6Var = (oa6) this.f36084a;
        e66 e66VarM9029p = oa6Var.m9029p();
        d76 d76Var = oa6Var.f26514f;
        if (!m4568Q(e66VarM9029p.m4936A())) {
            return 0L;
        }
        boolean zBooleanValue = false;
        Integer num2 = null;
        if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = (SdkExtensions.getExtensionVersion(30) > 3 ? SdkExtensions.getExtensionVersion(1000000) : 0) < ((Integer) e56.f17802l0.m4379a(null)).intValue() ? 16L : 0L;
        }
        if (!m4595R("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.f17227k != null) {
                zBooleanValue = this.f17227k.booleanValue();
            } else {
                fr2 fr2VarM4593O = m4593O();
                if (fr2VarM4593O != null) {
                    try {
                        num = (Integer) fr2VarM4593O.m5790b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
                                e = e2;
                                num2 = num;
                                oa6.m9016l(d76Var);
                                d76Var.f16838m.m12505b(e, "Measurement manager api exception");
                                this.f17227k = Boolean.FALSE;
                                num = num2;
                            }
                        }
                        this.f17227k = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e3) {
                        e = e3;
                    }
                    oa6.m9016l(d76Var);
                    d76Var.f16831L.m12505b(num, "Measurement manager api status result");
                    zBooleanValue = this.f17227k.booleanValue();
                }
            }
            if (!zBooleanValue) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m4595R(String str) {
        mo5038t();
        oa6 oa6Var = (oa6) this.f36084a;
        if (r35.m10189a(oa6Var.f26509a).f34949a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16842q.m12505b(str, "Permission not granted");
        return false;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m4596U(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((oa6) this.f36084a).f26512d.m9234y("debug.firebase.analytics.app").equals(str);
    }

    /* JADX INFO: renamed from: V */
    public final Bundle m4597V(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM4580B = m4580B(bundle.get(str), str);
                if (objM4580B == null) {
                    oa6 oa6Var = (oa6) this.f36084a;
                    d76 d76Var = oa6Var.f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16840o.m12505b(oa6Var.f26518j.m9367b(str), "Param value can't be null");
                } else {
                    m4592J(bundle2, str, objM4580B);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: W */
    public final ys5 m4598W(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m4622z0(str) != 0) {
            oa6 oa6Var = (oa6) this.f36084a;
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12505b(oa6Var.f26518j.m9368c(str), "Invalid conditional property event name");
            ds3.m4665g();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleM4582C = m4582C(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleM4582C = m4597V(bundleM4582C);
        }
        y42.m12854a0(bundleM4582C);
        return new ys5(str, new os5(bundleM4582C), str2, j);
    }

    /* JADX INFO: renamed from: X */
    public final boolean m4599X(Context context, String str) {
        Signature[] signatureArr;
        oa6 oa6Var = (oa6) this.f36084a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM12998b = r35.m10189a(context).m12998b(64, str);
            if (packageInfoM12998b == null || (signatureArr = packageInfoM12998b.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12505b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12505b(e2, "Error obtaining certificate");
            return true;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m4600Z(int i) {
        Boolean bool = ((oa6) this.f36084a).m9027n().f26790i;
        if (m4601a0() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final int m4601a0() {
        Integer numValueOf = this.f17228l;
        if (numValueOf == null) {
            oa6 oa6Var = (oa6) this.f36084a;
            qt1 qt1Var = qt1.f28785b;
            Context context = oa6Var.f26509a;
            qt1Var.getClass();
            int i = yt1.f35521e;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            numValueOf = Integer.valueOf(i2 / 1000);
            this.f17228l = numValueOf;
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m4602b0(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4603c0(String str, qx5 qx5Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            qx5Var.mo7338h(bundle);
        } catch (RemoteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(e, "Error returning string value to wrapper");
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m4604d0(qx5 qx5Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            qx5Var.mo7338h(bundle);
        } catch (RemoteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(e, "Error returning long value to wrapper");
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m4605e0(qx5 qx5Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            qx5Var.mo7338h(bundle);
        } catch (RemoteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(e, "Error returning int value to wrapper");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m4606f0(qx5 qx5Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            qx5Var.mo7338h(bundle);
        } catch (RemoteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(e, "Error returning byte array to wrapper");
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m4607g0(qx5 qx5Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            qx5Var.mo7338h(bundle);
        } catch (RemoteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(e, "Error returning boolean value to wrapper");
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m4608h0(qx5 qx5Var, Bundle bundle) {
        try {
            qx5Var.mo7338h(bundle);
        } catch (RemoteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(e, "Error returning bundle value to wrapper");
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m4609i0(qx5 qx5Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            qx5Var.mo7338h(bundle);
        } catch (RemoteException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(e, "Error returning bundle list to wrapper");
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final String m4610m0() {
        byte[] bArr = new byte[16];
        m4614s0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: renamed from: o0 */
    public final Object m4611o0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m4577z(obj.toString(), z, i);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleM4597V = m4597V((Bundle) parcelable);
                if (!bundleM4597V.isEmpty()) {
                    arrayList.add(bundleM4597V);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: p0 */
    public final int m4612p0(String str) {
        oa6 oa6Var = (oa6) this.f36084a;
        if ("_ldl".equals(str)) {
            op5 op5Var = oa6Var.f26512d;
            return 2048;
        }
        if ("_id".equals(str)) {
            op5 op5Var2 = oa6Var.f26512d;
            return 256;
        }
        if ("_lgclid".equals(str)) {
            op5 op5Var3 = oa6Var.f26512d;
            return 100;
        }
        op5 op5Var4 = oa6Var.f26512d;
        return 36;
    }

    /* JADX INFO: renamed from: r0 */
    public final long m4613r0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f17224h;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f17224h;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((oa6) this.f36084a).f26519k.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f17225i + 1;
            this.f17225i = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    /* JADX INFO: renamed from: s0 */
    public final SecureRandom m4614s0() {
        mo5038t();
        SecureRandom secureRandom = this.f17223g;
        if (secureRandom != null) {
            return secureRandom;
        }
        SecureRandom secureRandom2 = new SecureRandom();
        this.f17223g = secureRandom2;
        return secureRandom2;
    }

    @Override // p000.lc6
    /* JADX INFO: renamed from: u */
    public final boolean mo4615u() {
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public final Bundle m4616u0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("gbraid");
                    queryParameter6 = uri.getQueryParameter("utm_id");
                    queryParameter7 = uri.getQueryParameter("dclid");
                    queryParameter8 = uri.getQueryParameter("srsltid");
                    queryParameter9 = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("gbraid", queryParameter5);
                }
                String queryParameter10 = uri.getQueryParameter("gad_source");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString("gad_source", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString("term", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle.putString("content", queryParameter12);
                }
                String queryParameter13 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter13)) {
                    bundle.putString("aclid", queryParameter13);
                }
                String queryParameter14 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter14)) {
                    bundle.putString("cp1", queryParameter14);
                }
                String queryParameter15 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter15)) {
                    bundle.putString("anid", queryParameter15);
                }
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("campaign_id", queryParameter6);
                }
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("dclid", queryParameter7);
                }
                String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter16)) {
                    bundle.putString("source_platform", queryParameter16);
                }
                String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter17)) {
                    bundle.putString("creative_format", queryParameter17);
                }
                String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter18)) {
                    bundle.putString("marketing_tactic", queryParameter18);
                }
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("srsltid", queryParameter8);
                }
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("sfmc_id", queryParameter9);
                }
                for (String str : uri.getQueryParameterNames()) {
                    if (str.startsWith("gad_")) {
                        String queryParameter19 = uri.getQueryParameter(str);
                        if (!TextUtils.isEmpty(queryParameter19)) {
                            bundle.putString(str, queryParameter19);
                        }
                    }
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                d76 d76Var = ((oa6) this.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12505b(e, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m4617v0(String str, String str2) {
        oa6 oa6Var = (oa6) this.f36084a;
        if (str2 == null) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16837l.m12505b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16837l.m12505b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            d76 d76Var3 = oa6Var.f26514f;
            oa6.m9016l(d76Var3);
            d76Var3.f16837l.m12506c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                d76 d76Var4 = oa6Var.f26514f;
                oa6.m9016l(d76Var4);
                d76Var4.f16837l.m12506c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m4618w0(String str, String str2) {
        oa6 oa6Var = (oa6) this.f36084a;
        if (str2 == null) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16837l.m12505b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16837l.m12505b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                d76 d76Var3 = oa6Var.f26514f;
                oa6.m9016l(d76Var3);
                d76Var3.f16837l.m12506c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                d76 d76Var4 = oa6Var.f26514f;
                oa6.m9016l(d76Var4);
                d76Var4.f16837l.m12506c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m4619x0(String str, String[] strArr, String[] strArr2, String str2) {
        oa6 oa6Var = (oa6) this.f36084a;
        if (str2 == null) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16837l.m12505b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(f17221m[i])) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16837l.m12506c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m4570T(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m4570T(str2, strArr2)) {
            return true;
        }
        d76 d76Var3 = oa6Var.f26514f;
        oa6.m9016l(d76Var3);
        d76Var3.f16837l.m12506c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m4620y(String str) {
        oa6 oa6Var = (oa6) this.f36084a;
        if (TextUtils.isEmpty(str)) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16837l.m12504a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        y42.m12854a0(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        d76 d76Var2 = oa6Var.f26514f;
        oa6.m9016l(d76Var2);
        d76Var2.f16837l.m12505b(d76.m4401y(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m4621y0(String str, int i, String str2) {
        oa6 oa6Var = (oa6) this.f36084a;
        if (str2 == null) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16837l.m12505b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        d76 d76Var2 = oa6Var.f26514f;
        oa6.m9016l(d76Var2);
        d76Var2.f16837l.m12507d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public final int m4622z0(String str) {
        if (!m4618w0("event", str)) {
            return 2;
        }
        if (!m4619x0("event", vd6.f32543f, vd6.f32544g, str)) {
            return 13;
        }
        op5 op5Var = ((oa6) this.f36084a).f26512d;
        return !m4621y0("event", 40, str) ? 2 : 0;
    }
}
