package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.LocaleList;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.VarHandle;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.Adler32;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jp0 implements InterfaceC1052pz {

    /* JADX INFO: renamed from: e */
    public static final ip0 f22477e = new ip0((byte) 0);

    /* JADX INFO: renamed from: f */
    public static final C1254vf f22478f = new C1254vf(1);

    /* JADX INFO: renamed from: g */
    public static final zq0 f22479g = new zq0();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22480a;

    /* JADX INFO: renamed from: b */
    public Object f22481b;

    /* JADX INFO: renamed from: c */
    public Object f22482c;

    /* JADX INFO: renamed from: d */
    public Object f22483d;

    public jp0(List list, ut2 ut2Var) throws GeneralSecurityException {
        this.f22480a = (byte) 26;
        this.f22481b = list;
        this.f22482c = ut2Var;
        if (ts1.f31385a.f33577a.get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                yd2 yd2Var = (yd2) it.next();
                int i = yd2Var.f35131d;
                if (hashSet.contains(Integer.valueOf(i))) {
                    throw new GeneralSecurityException(c75.m3878j("KeyID ", i, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(Integer.valueOf(i));
                if (yd2Var.f35132e) {
                    z = true;
                }
            }
            if (!z) {
                xy4.m12788q("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                throw null;
            }
        }
        this.f22483d = null;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m7202H(hd2 hd2Var) {
        int iOrdinal = hd2Var.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
    }

    /* JADX INFO: renamed from: I */
    public static void m7203I(if1 if1Var, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            if1Var.m6788c(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e);
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m7204J(jp0 jp0Var, vt1 vt1Var, C0572de c0572de, Object obj) {
        jp0Var.getClass();
        C1190tp c1190tp = new C1190tp(vt1Var);
        synchronized (((f70) jp0Var.f22483d)) {
            try {
                if (obj == null) {
                    ((lw2) jp0Var.f22482c).m8138m(c1190tp, C1153sp.m10887a(null));
                } else {
                    ((bp2) jp0Var.f22481b).m3649d(c1190tp, C1153sp.m10887a(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static final jp0 m7205K(la2 la2Var) throws GeneralSecurityException, IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = la2Var.f23890a;
            try {
                try {
                    wd2 wd2VarM7888b = la2.m7888b(cb2.m3941b(new String(aw4.m3328a(byteArrayInputStream), la2.f23889b)).m3528l());
                    byteArrayInputStream.close();
                    try {
                        wd2 wd2VarM12227D = wd2.m12227D(wd2VarM7888b.m11692e(), qc1.m9861a());
                        m7208d(wd2VarM12227D);
                        return m7213t(wd2VarM12227D);
                    } catch (h72 unused) {
                        xy4.m12788q("invalid keyset");
                        return null;
                    }
                } catch (Throwable th) {
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    throw th;
                }
            } catch (IllegalStateException | za2 e) {
                throw new IOException(e);
            }
        } catch (h72 unused2) {
            xy4.m12788q("invalid keyset");
            return null;
        }
    }

    /* JADX INFO: renamed from: W */
    public static se0 m7206W(vd2 vd2Var) {
        mh3 mh3VarM7207X = m7207X(vd2Var);
        nw2 nw2Var = nw2.f26151b;
        r24 r24Var = (r24) nw2Var.f26152a.get();
        r24Var.getClass();
        if (r24Var.f28971b.containsKey(new p24(mh3.class, mh3VarM7207X.f24918b))) {
            return nw2Var.m8871a(mh3VarM7207X);
        }
        rj2 rj2Var = new rj2();
        mh3VarM7207X.f24920d.ordinal();
        rj2Var.f29353u = mh3VarM7207X;
        VarHandle.storeStoreFence();
        return rj2Var;
    }

    /* JADX INFO: renamed from: X */
    public static mh3 m7207X(vd2 vd2Var) {
        return mh3.m8323b(vd2Var.m11812x().m10292z(), vd2Var.m11812x().m10287A(), vd2Var.m11812x().m10291y(), vd2Var.m11814z(), vd2Var.m11814z() == j63.f22047e ? null : Integer.valueOf(vd2Var.m11813y()));
    }

    /* JADX INFO: renamed from: d */
    public static void m7208d(wd2 wd2Var) throws GeneralSecurityException {
        for (vd2 vd2Var : wd2Var.m12228A()) {
            if (vd2Var.m11812x().m10291y() == qc2.f28375b || vd2Var.m11812x().m10291y() == qc2.f28376c || vd2Var.m11812x().m10291y() == qc2.f28377d) {
                throw new GeneralSecurityException(c75.m3879k("keyset contains key material of type ", vd2Var.m11812x().m10291y().name(), " for type url ", vd2Var.m11812x().m10292z()));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m7209m() {
        if (((Boolean) new C0941nc(0, f22479g, zq0.class, "isBackgroundThread", "isBackgroundThread()Z", 0, (byte) 1).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m7210n() {
        if (((Boolean) new C0941nc(0, f22479g, zq0.class, "isBlockingThread", "isBlockingThread()Z", 0, (byte) 2).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public static vd2 m7211q(se0 se0Var, hd2 hd2Var, int i) throws GeneralSecurityException {
        mh3 mh3VarMo4672d;
        r24 r24Var = (r24) nw2.f26151b.f26152a.get();
        r24Var.getClass();
        q24 q24Var = new q24(se0Var.getClass(), mh3.class);
        HashMap map = r24Var.f28970a;
        if (map.containsKey(q24Var)) {
            mh3VarMo4672d = ((fd2) map.get(q24Var)).f18923b.mo4672d(se0Var);
        } else {
            xy4.m12793v("No Key serializer for ", q24Var, " available");
            mh3VarMo4672d = null;
        }
        Integer numMo4966A = se0Var.mo4966A();
        if (numMo4966A != null && numMo4966A.intValue() != i) {
            xy4.m12788q("Wrong ID set for key with ID requirement");
            return null;
        }
        ud2 ud2VarM11805C = vd2.m11805C();
        pc2 pc2VarM10285B = rc2.m10285B();
        String str = mh3VarMo4672d.f24917a;
        pc2VarM10285B.m9631e();
        ((rc2) pc2VarM10285B.f27912b).m10289D(str);
        t50 t50Var = mh3VarMo4672d.f24919c;
        pc2VarM10285B.m9631e();
        ((rc2) pc2VarM10285B.f27912b).m10290E(t50Var);
        qc2 qc2Var = mh3VarMo4672d.f24920d;
        pc2VarM10285B.m9631e();
        ((rc2) pc2VarM10285B.f27912b).m10288C(qc2Var);
        ud2VarM11805C.m9631e();
        ((vd2) ud2VarM11805C.f27912b).m11808D((rc2) pc2VarM10285B.m9628b());
        ud2VarM11805C.m9631e();
        ((vd2) ud2VarM11805C.f27912b).m11811G(hd2Var);
        ud2VarM11805C.m9631e();
        ((vd2) ud2VarM11805C.f27912b).m11809E(i);
        j63 j63Var = mh3VarMo4672d.f24921e;
        ud2VarM11805C.m9631e();
        ((vd2) ud2VarM11805C.f27912b).m11810F(j63Var);
        return (vd2) ud2VarM11805C.m9628b();
    }

    /* JADX INFO: renamed from: r */
    public static String m7212r(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return zi4.m13621u(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return str.concat(string);
    }

    /* JADX INFO: renamed from: t */
    public static final jp0 m7213t(wd2 wd2Var) throws GeneralSecurityException {
        boolean z;
        se0 se0VarM7206W;
        if (wd2Var.m12233z() <= 0) {
            xy4.m12788q("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(wd2Var.m12233z());
        for (vd2 vd2Var : wd2Var.m12228A()) {
            int iM11813y = vd2Var.m11813y();
            try {
                z = false;
                se0VarM7206W = m7206W(vd2Var);
            } catch (GeneralSecurityException e) {
                if (ts1.f31385a.f33577a.get()) {
                    throw e;
                }
                mh3 mh3VarM7207X = m7207X(vd2Var);
                rj2 rj2Var = new rj2();
                mh3VarM7207X.f24920d.ordinal();
                rj2Var.f29353u = mh3VarM7207X;
                z = true;
                se0VarM7206W = rj2Var;
            }
            if (ts1.f31385a.f33577a.get() && !m7202H(vd2Var.m11806A())) {
                xy4.m12788q("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            hd2 hd2VarM11806A = vd2Var.m11806A();
            boolean z2 = iM11813y == wd2Var.m12229B();
            yd2 yd2Var = new yd2();
            yd2Var.f35128a = se0VarM7206W;
            yd2Var.f35129b = hd2VarM11806A;
            int iOrdinal = hd2VarM11806A.ordinal();
            yd2Var.f35130c = iOrdinal != 1 ? iOrdinal != 3 ? C0641f8.f18816q : C0641f8.f18817r : C0641f8.f18815p;
            yd2Var.f35131d = iM11813y;
            yd2Var.f35132e = z2;
            yd2Var.f35133f = z;
            yd2Var.f35134g = yd2.f35127h;
            VarHandle.storeStoreFence();
            arrayList.add(yd2Var);
        }
        return new jp0(Collections.unmodifiableList(arrayList), ut2.f32155b);
    }

    /* JADX INFO: renamed from: u */
    public static void m7214u(jp0 jp0Var, z32 z32Var) {
        long[] jArr = (long[]) jp0Var.f22481b;
        jp0 jp0Var2 = (jp0) z32Var.f35738b;
        long[] jArr2 = (long[]) jp0Var2.f22481b;
        long[] jArr3 = (long[]) z32Var.f35739c;
        kx5.m7697a0(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) jp0Var.f22482c;
        long[] jArr5 = (long[]) jp0Var2.f22482c;
        long[] jArr6 = (long[]) jp0Var2.f22483d;
        kx5.m7697a0(jArr4, jArr5, jArr6);
        kx5.m7697a0((long[]) jp0Var.f22483d, jArr6, jArr3);
    }

    /* JADX INFO: renamed from: A */
    public wd2 m7215A() {
        try {
            td2 td2VarM12226C = wd2.m12226C();
            for (yd2 yd2Var : (List) this.f22481b) {
                se0 se0VarM13097a = yd2Var.m13097a();
                int i = yd2Var.f35131d;
                vd2 vd2VarM7211q = m7211q(se0VarM13097a, yd2Var.f35129b, i);
                td2VarM12226C.m9631e();
                ((wd2) td2VarM12226C.f27912b).m12231x(vd2VarM7211q);
                if (yd2Var.f35132e) {
                    td2VarM12226C.m9631e();
                    ((wd2) td2VarM12226C.f27912b).m12230E(i);
                }
            }
            return (wd2) td2VarM12226C.m9628b();
        } catch (GeneralSecurityException e) {
            wb1.m12194m(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    public df2 m7216B() {
        return ((j70) this.f22483d).f22063a.f21147b;
    }

    /* JADX INFO: renamed from: C */
    public yd2 m7217C() {
        for (yd2 yd2Var : (List) this.f22481b) {
            if (yd2Var != null && yd2Var.f35132e) {
                if (yd2Var.f35130c == C0641f8.f18815p) {
                    return yd2Var;
                }
                C1077qn.m9989o("Keyset has primary which isn't enabled");
                return null;
            }
        }
        C1077qn.m9989o("Keyset has no valid primary");
        return null;
    }

    /* JADX INFO: renamed from: D */
    public Object m7218D() throws GeneralSecurityException {
        List list = (List) this.f22481b;
        jp0 jp0Var = (jp0) this.f22483d;
        wd2 wd2VarM7215A = (jp0Var == null ? this : jp0Var).m7215A();
        int i = aw4.f14920a;
        int iM12229B = wd2VarM7215A.m12229B();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (vd2 vd2Var : wd2VarM7215A.m12228A()) {
            if (vd2Var.m11806A() == hd2.f20489c) {
                if (!vd2Var.m11807B()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(vd2Var.m11813y())));
                }
                if (vd2Var.m11814z() == j63.f22044b) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(vd2Var.m11813y())));
                }
                if (vd2Var.m11806A() == hd2.f20488b) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(vd2Var.m11813y())));
                }
                if (vd2Var.m11813y() == iM12229B) {
                    if (z2) {
                        xy4.m12788q("keyset contains multiple primary keys");
                        return null;
                    }
                    z2 = true;
                }
                if (vd2Var.m11812x().m10291y() != qc2.f28378e) {
                    z = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            xy4.m12788q("keyset must contain at least one ENABLED key");
            return null;
        }
        if (!z2 && !z) {
            xy4.m12788q("keyset doesn't contain a valid primary key");
            return null;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((yd2) list.get(i3)).f35133f || !m7202H(((yd2) list.get(i3)).f35129b)) {
                vd2 vd2VarM12232y = wd2VarM7215A.m12232y(i3);
                StringBuilder sbM3883o = c75.m3883o("Key parsing of key with index ", i3, " and type_url ");
                sbM3883o.append(vd2VarM12232y.m11812x().m10292z());
                sbM3883o.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sbM3883o.toString());
            }
        }
        if (jp0Var == null) {
            jp0Var = this;
        }
        ut2 ut2Var = (ut2) this.f22482c;
        wf3 wf3Var = (wf3) iw2.f21844b.f21845a.get();
        HashMap map = wf3Var.f33338b;
        if (!map.containsKey(ei3.class)) {
            xd2.m12666m(ei3.class, "No wrapper found for ");
            return null;
        }
        yf3 yf3Var = (yf3) map.get(ei3.class);
        C1163sz c1163sz = new C1163sz((byte) 12);
        c1163sz.f30676b = wf3Var;
        c1163sz.f30677c = yf3Var;
        VarHandle.storeStoreFence();
        return yf3Var.mo4515b(jp0Var, ut2Var, c1163sz);
    }

    /* JADX INFO: renamed from: E */
    public long m7219E() {
        return ((j70) this.f22483d).f22063a.f21149d;
    }

    /* JADX INFO: renamed from: F */
    public void m7220F(String str, String str2) {
        ((HashMap) this.f22483d).put(str, str2);
    }

    /* JADX INFO: renamed from: G */
    public boolean m7221G() {
        return !(((ha4) ((ar3) this.f22481b).f14813b).isEmpty() && ((ha4) ((ar3) this.f22483d).f14813b).isEmpty() && ((ha4) ((ar3) this.f22482c).f14813b).isEmpty());
    }

    /* JADX INFO: renamed from: L */
    public boolean m7222L(int i) {
        ea4 ea4Var;
        if (i == 7 || i == 2 || i == 6 || i == 5 || i == 3 || i == 4) {
            m7251z();
        } else if (i != 1 && i != 0) {
            C1077qn.m9989o("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            zk1 zk1Var = (zk1) this.f22483d;
            if (zk1Var != null) {
                ((bl1) zk1Var).m3621g(1, true);
                return true;
            }
            z62.m13366Y("focusManager");
            throw null;
        }
        if (i != 5) {
            if (i != 7 || (ea4Var = (ea4) this.f22481b) == null) {
                return false;
            }
            ((ay0) ea4Var).m3365a();
            return true;
        }
        zk1 zk1Var2 = (zk1) this.f22483d;
        if (zk1Var2 != null) {
            ((bl1) zk1Var2).m3621g(2, true);
            return true;
        }
        z62.m13366Y("focusManager");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: M */
    public Object m7223M(vt1 vt1Var, C0572de c0572de, C0792jb c0792jb, ym0 ym0Var) {
        C1227up c1227up;
        C1190tp c1190tp;
        if (ym0Var instanceof C1227up) {
            c1227up = (C1227up) ym0Var;
            int i = c1227up.f32054w;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1227up.f32054w = i - Integer.MIN_VALUE;
            } else {
                c1227up = new C1227up(this, ym0Var);
            }
        } else {
            c1227up = new C1227up(this, ym0Var);
        }
        Object obj = c1227up.f32052u;
        Object obj2 = ap0.f14763a;
        int i2 = c1227up.f32054w;
        if (i2 == 0) {
            k43.m7376J(obj);
            c0572de.getClass();
            C1190tp c1190tp2 = new C1190tp(vt1Var);
            synchronized (((f70) this.f22483d)) {
                try {
                    C1153sp c1153sp = (C1153sp) ((bp2) this.f22481b).m3648c(c1190tp2);
                    if (c1153sp == null) {
                        c1153sp = (C1153sp) ((lw2) this.f22482c).m8132g(c1190tp2);
                    }
                    if (c1153sp != null) {
                        return c1153sp.f30455a;
                    }
                    c1227up.f32051t = c1190tp2;
                    c1227up.f32054w = 1;
                    Object objInvoke = c0792jb.invoke(c1227up);
                    if (objInvoke == obj2) {
                        return obj2;
                    }
                    obj = objInvoke;
                    c1190tp = c1190tp2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1190tp = c1227up.f32051t;
            k43.m7376J(obj);
        }
        synchronized (((f70) this.f22483d)) {
            try {
                if (obj == null) {
                    ((lw2) this.f22482c).m8138m(c1190tp, C1153sp.m10887a(null));
                } else {
                    ((bp2) this.f22481b).m3649d(c1190tp, C1153sp.m10887a(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: N */
    public void m7224N(C0588dv c0588dv, int i, boolean z) {
        C1269vu c1269vu = (C1269vu) this.f22483d;
        Context context = (Context) this.f22481b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = c0588dv.f17420a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ag3 ag3Var = c0588dv.f17422c;
        adler32.update(byteBufferAllocate.putInt(bg3.m3588a(ag3Var)).array());
        byte[] bArr = c0588dv.f17421b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    se0.m10736q("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c0588dv);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((pt3) this.f22482c).m9671a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(bg3.m3588a(ag3Var))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(c1269vu.m11989a(ag3Var, jLongValue, i));
            Set set = ((C1307wu) c1269vu.f32874b.get(ag3Var)).f33728c;
            if (set.contains(cw3.f16535a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(cw3.f16537c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(cw3.f16536b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", bg3.m3588a(ag3Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c0588dv, Integer.valueOf(value), Long.valueOf(c1269vu.m11989a(ag3Var, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.JobInfoScheduler", 3)) {
                Log.d("TRuntime.JobInfoScheduler", String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m7225O(String str) {
        if (str != null) {
            this.f22482c = str;
        } else {
            xy4.m12782k("Null backendName");
        }
    }

    /* JADX INFO: renamed from: P */
    public void m7226P(h70 h70Var) {
        ((j70) this.f22483d).f22063a.f21148c = h70Var;
    }

    /* JADX INFO: renamed from: Q */
    public void m7227Q(ky0 ky0Var) {
        ((j70) this.f22483d).f22063a.f21146a = ky0Var;
    }

    /* JADX INFO: renamed from: R */
    public void m7228R(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f22481b = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: S */
    public void m7229S(df2 df2Var) {
        ((j70) this.f22483d).f22063a.f21147b = df2Var;
    }

    /* JADX INFO: renamed from: T */
    public void m7230T(long j) {
        ((j70) this.f22483d).f22063a.f21149d = j;
    }

    /* JADX INFO: renamed from: U */
    public void m7231U(int i) {
        if (i < 10 || 16 < i) {
            throw new GeneralSecurityException(c75.m3877i(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.f22482c = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: V */
    public byte[] m7232V() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = (long[]) this.f22483d;
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = new long[10];
        kx5.m7725o0(jArr5, jArr4);
        kx5.m7725o0(jArr14, jArr5);
        kx5.m7725o0(jArr13, jArr14);
        kx5.m7697a0(jArr6, jArr13, jArr4);
        kx5.m7697a0(jArr7, jArr6, jArr5);
        kx5.m7725o0(jArr13, jArr7);
        kx5.m7697a0(jArr8, jArr13, jArr6);
        kx5.m7725o0(jArr13, jArr8);
        kx5.m7725o0(jArr14, jArr13);
        kx5.m7725o0(jArr13, jArr14);
        kx5.m7725o0(jArr14, jArr13);
        kx5.m7725o0(jArr13, jArr14);
        kx5.m7697a0(jArr9, jArr13, jArr8);
        kx5.m7725o0(jArr13, jArr9);
        kx5.m7725o0(jArr14, jArr13);
        for (int i = 2; i < 10; i += 2) {
            kx5.m7725o0(jArr13, jArr14);
            kx5.m7725o0(jArr14, jArr13);
        }
        kx5.m7697a0(jArr10, jArr14, jArr9);
        kx5.m7725o0(jArr13, jArr10);
        kx5.m7725o0(jArr14, jArr13);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            kx5.m7725o0(jArr13, jArr14);
            kx5.m7725o0(jArr14, jArr13);
        }
        kx5.m7697a0(jArr13, jArr14, jArr10);
        kx5.m7725o0(jArr14, jArr13);
        kx5.m7725o0(jArr13, jArr14);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            kx5.m7725o0(jArr14, jArr13);
            kx5.m7725o0(jArr13, jArr14);
        }
        kx5.m7697a0(jArr11, jArr13, jArr9);
        kx5.m7725o0(jArr13, jArr11);
        kx5.m7725o0(jArr14, jArr13);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            kx5.m7725o0(jArr13, jArr14);
            kx5.m7725o0(jArr14, jArr13);
        }
        kx5.m7697a0(jArr12, jArr14, jArr11);
        kx5.m7725o0(jArr14, jArr12);
        kx5.m7725o0(jArr13, jArr14);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            kx5.m7725o0(jArr14, jArr13);
            kx5.m7725o0(jArr13, jArr14);
        }
        kx5.m7697a0(jArr14, jArr13, jArr12);
        kx5.m7725o0(jArr13, jArr14);
        kx5.m7725o0(jArr14, jArr13);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            kx5.m7725o0(jArr13, jArr14);
            kx5.m7725o0(jArr14, jArr13);
        }
        kx5.m7697a0(jArr13, jArr14, jArr11);
        kx5.m7725o0(jArr14, jArr13);
        kx5.m7725o0(jArr13, jArr14);
        kx5.m7725o0(jArr14, jArr13);
        kx5.m7725o0(jArr13, jArr14);
        kx5.m7725o0(jArr14, jArr13);
        kx5.m7697a0(jArr, jArr14, jArr7);
        kx5.m7697a0(jArr2, (long[]) this.f22481b, jArr);
        kx5.m7697a0(jArr3, (long[]) this.f22482c, jArr);
        byte[] bArrM7679F = kx5.m7679F(jArr3);
        bArrM7679F[31] = (byte) (bArrM7679F[31] ^ ((kx5.m7679F(jArr2)[0] & 1) << 7));
        return bArrM7679F;
    }

    @Override // p000.InterfaceC1052pz
    /* JADX INFO: renamed from: a */
    public void mo7233a(f00 f00Var) {
        ((b70) this.f22481b).resumeWith(Integer.valueOf(f00Var.f18622a));
    }

    @Override // p000.InterfaceC1052pz
    /* JADX INFO: renamed from: b */
    public void mo7234b() {
        xn2 xn2Var = (xn2) this.f22482c;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "on billing service disconnected", null);
            }
        }
        d83 d83Var = ((C1349xz) this.f22483d).f34727a;
        C0927mz c0927mz = (C0927mz) d83Var.getValue();
        if (c0927mz != null) {
            c0927mz.mo5433c();
        }
        d83Var.setValue(null);
    }

    /* JADX INFO: renamed from: c */
    public void m7235c(wf2 wf2Var, k72 k72Var) {
        ar3 ar3Var = (ar3) this.f22481b;
        ar3 ar3Var2 = (ar3) this.f22482c;
        ar3 ar3Var3 = (ar3) this.f22483d;
        int iOrdinal = k72Var.ordinal();
        if (iOrdinal == 0) {
            ar3Var.m3144l(wf2Var);
            ar3Var3.m3144l(wf2Var);
            return;
        }
        if (iOrdinal == 1) {
            ar3Var2.m3144l(wf2Var);
            ar3Var3.m3144l(wf2Var);
            return;
        }
        if (iOrdinal == 2) {
            if (wf2Var.f33319i != null) {
                ar3Var3.m3144l(wf2Var);
                return;
            } else {
                ar3Var.m3144l(wf2Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            C0670g.m5864c();
        } else if (wf2Var.f33319i != null) {
            ar3Var3.m3144l(wf2Var);
        } else {
            ar3Var2.m3144l(wf2Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public C0825k7 m7236e() throws GeneralSecurityException {
        wd3 wd3Var;
        u50 u50VarM7410a;
        C1024p7 c1024p7 = (C1024p7) this.f22481b;
        if (c1024p7 == null || (wd3Var = (wd3) this.f22482c) == null) {
            xy4.m12788q("Cannot build without parameters and/or key material");
            return null;
        }
        if (c1024p7.f27411a != ((u50) wd3Var.f33259b).f31654a.length) {
            xy4.m12788q("Key size mismatch");
            return null;
        }
        if (c1024p7.mo5593a() && ((Integer) this.f22483d) == null) {
            xy4.m12788q("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C1024p7) this.f22481b).mo5593a() && ((Integer) this.f22483d) != null) {
            xy4.m12788q("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C0973o7 c0973o7 = ((C1024p7) this.f22481b).f27413c;
        if (c0973o7 == C0973o7.f26380f) {
            u50VarM7410a = k63.f22941a;
        } else if (c0973o7 == C0973o7.f26379e || c0973o7 == C0973o7.f26378d) {
            u50VarM7410a = k63.m7410a(((Integer) this.f22483d).intValue());
        } else {
            if (c0973o7 != C0973o7.f26377c) {
                wb1.m12197q(((C1024p7) this.f22481b).f27413c, "Unknown AesCmacParametersParameters.Variant: ");
                return null;
            }
            u50VarM7410a = k63.m7411b(((Integer) this.f22483d).intValue());
        }
        C1024p7 c1024p8 = (C1024p7) this.f22481b;
        wd3 wd3Var2 = (wd3) this.f22482c;
        Integer num = (Integer) this.f22483d;
        C0825k7 c0825k7 = new C0825k7();
        c0825k7.f22945u = c1024p8;
        c0825k7.f22946v = wd3Var2;
        c0825k7.f22947w = u50VarM7410a;
        c0825k7.f22948x = num;
        VarHandle.storeStoreFence();
        return c0825k7;
    }

    /* JADX INFO: renamed from: f */
    public C1024p7 m7237f() {
        Integer num = (Integer) this.f22481b;
        if (num == null) {
            xy4.m12788q("key size not set");
            return null;
        }
        if (((Integer) this.f22482c) == null) {
            xy4.m12788q("tag size not set");
            return null;
        }
        if (((C0973o7) this.f22483d) == null) {
            xy4.m12788q("variant not set");
            return null;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.f22482c).intValue();
        C0973o7 c0973o7 = (C0973o7) this.f22483d;
        C1024p7 c1024p7 = new C1024p7();
        c1024p7.f27411a = iIntValue;
        c1024p7.f27412b = iIntValue2;
        c1024p7.f27413c = c0973o7;
        VarHandle.storeStoreFence();
        return c1024p7;
    }

    /* JADX INFO: renamed from: g */
    public C1173t8 m7238g() throws GeneralSecurityException {
        wd3 wd3Var;
        u50 u50VarM7411b;
        C1322x8 c1322x8 = (C1322x8) this.f22481b;
        if (c1322x8 == null || (wd3Var = (wd3) this.f22482c) == null) {
            xy4.m12788q("Cannot build without parameters and/or key material");
            return null;
        }
        if (c1322x8.f34054a != ((u50) wd3Var.f33259b).f31654a.length) {
            xy4.m12788q("Key size mismatch");
            return null;
        }
        if (c1322x8.mo5593a() && ((Integer) this.f22483d) == null) {
            xy4.m12788q("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C1322x8) this.f22481b).mo5593a() && ((Integer) this.f22483d) != null) {
            xy4.m12788q("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C0641f8 c0641f8 = ((C1322x8) this.f22481b).f34057d;
        if (c0641f8 == C0641f8.f18809j) {
            u50VarM7411b = k63.f22941a;
        } else if (c0641f8 == C0641f8.f18808i) {
            u50VarM7411b = k63.m7410a(((Integer) this.f22483d).intValue());
        } else {
            if (c0641f8 != C0641f8.f18807h) {
                wb1.m12197q(((C1322x8) this.f22481b).f34057d, "Unknown AesEaxParameters.Variant: ");
                return null;
            }
            u50VarM7411b = k63.m7411b(((Integer) this.f22483d).intValue());
        }
        C1322x8 c1322x9 = (C1322x8) this.f22481b;
        wd3 wd3Var2 = (wd3) this.f22482c;
        Integer num = (Integer) this.f22483d;
        C1173t8 c1173t8 = new C1173t8();
        c1173t8.f30980u = c1322x9;
        c1173t8.f30981v = wd3Var2;
        c1173t8.f30982w = u50VarM7411b;
        c1173t8.f30983x = num;
        VarHandle.storeStoreFence();
        return c1173t8;
    }

    /* JADX INFO: renamed from: h */
    public C0603e9 m7239h() throws GeneralSecurityException {
        wd3 wd3Var;
        u50 u50VarM7411b;
        C0754i9 c0754i9 = (C0754i9) this.f22481b;
        if (c0754i9 == null || (wd3Var = (wd3) this.f22482c) == null) {
            xy4.m12788q("Cannot build without parameters and/or key material");
            return null;
        }
        if (c0754i9.f21179a != ((u50) wd3Var.f33259b).f31654a.length) {
            xy4.m12788q("Key size mismatch");
            return null;
        }
        if (c0754i9.mo5593a() && ((Integer) this.f22483d) == null) {
            xy4.m12788q("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C0754i9) this.f22481b).mo5593a() && ((Integer) this.f22483d) != null) {
            xy4.m12788q("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C0973o7 c0973o7 = ((C0754i9) this.f22481b).f21182d;
        if (c0973o7 == C0973o7.f26386l) {
            u50VarM7411b = k63.f22941a;
        } else if (c0973o7 == C0973o7.f26385k) {
            u50VarM7411b = k63.m7410a(((Integer) this.f22483d).intValue());
        } else {
            if (c0973o7 != C0973o7.f26384j) {
                wb1.m12197q(((C0754i9) this.f22481b).f21182d, "Unknown AesGcmParameters.Variant: ");
                return null;
            }
            u50VarM7411b = k63.m7411b(((Integer) this.f22483d).intValue());
        }
        C0754i9 c0754i10 = (C0754i9) this.f22481b;
        wd3 wd3Var2 = (wd3) this.f22482c;
        Integer num = (Integer) this.f22483d;
        C0603e9 c0603e9 = new C0603e9();
        c0603e9.f17900u = c0754i10;
        c0603e9.f17901v = wd3Var2;
        c0603e9.f17902w = u50VarM7411b;
        c0603e9.f17903x = num;
        VarHandle.storeStoreFence();
        return c0603e9;
    }

    /* JADX INFO: renamed from: i */
    public C0975o9 m7240i() throws GeneralSecurityException {
        wd3 wd3Var;
        u50 u50VarM7411b;
        C1137s9 c1137s9 = (C1137s9) this.f22481b;
        if (c1137s9 == null || (wd3Var = (wd3) this.f22482c) == null) {
            xy4.m12788q("Cannot build without parameters and/or key material");
            return null;
        }
        if (c1137s9.f29996a != ((u50) wd3Var.f33259b).f31654a.length) {
            xy4.m12788q("Key size mismatch");
            return null;
        }
        if (c1137s9.mo5593a() && ((Integer) this.f22483d) == null) {
            xy4.m12788q("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C1137s9) this.f22481b).mo5593a() && ((Integer) this.f22483d) != null) {
            xy4.m12788q("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C0641f8 c0641f8 = ((C1137s9) this.f22481b).f29997b;
        if (c0641f8 == C0641f8.f18812m) {
            u50VarM7411b = k63.f22941a;
        } else if (c0641f8 == C0641f8.f18811l) {
            u50VarM7411b = k63.m7410a(((Integer) this.f22483d).intValue());
        } else {
            if (c0641f8 != C0641f8.f18810k) {
                wb1.m12197q(((C1137s9) this.f22481b).f29997b, "Unknown AesGcmSivParameters.Variant: ");
                return null;
            }
            u50VarM7411b = k63.m7411b(((Integer) this.f22483d).intValue());
        }
        C1137s9 c1137s10 = (C1137s9) this.f22481b;
        wd3 wd3Var2 = (wd3) this.f22482c;
        Integer num = (Integer) this.f22483d;
        C0975o9 c0975o9 = new C0975o9();
        c0975o9.f26468u = c1137s10;
        c0975o9.f26469v = wd3Var2;
        c0975o9.f26470w = u50VarM7411b;
        c0975o9.f26471x = num;
        VarHandle.storeStoreFence();
        return c0975o9;
    }

    /* JADX INFO: renamed from: j */
    public C0588dv m7241j() {
        String strConcat = ((String) this.f22482c) == null ? " backendName" : "";
        if (((ag3) this.f22483d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (!strConcat.isEmpty()) {
            C1077qn.m9989o("Missing required properties:".concat(strConcat));
            return null;
        }
        String str = (String) this.f22482c;
        byte[] bArr = (byte[]) this.f22481b;
        ag3 ag3Var = (ag3) this.f22483d;
        C0588dv c0588dv = new C0588dv();
        c0588dv.f17420a = str;
        c0588dv.f17421b = bArr;
        c0588dv.f17422c = ag3Var;
        VarHandle.storeStoreFence();
        return c0588dv;
    }

    /* JADX INFO: renamed from: k */
    public t51 m7242k() {
        u50 u50VarM7410a;
        l51 l51Var = (l51) this.f22481b;
        if (l51Var == null) {
            xy4.m12788q("Cannot build without parameters");
            return null;
        }
        ECPoint eCPoint = (ECPoint) this.f22482c;
        if (eCPoint == null) {
            xy4.m12788q("Cannot build without public point");
            return null;
        }
        k71.m7413b(eCPoint, l51Var.f23793b.f22901b.getCurve());
        if (((l51) this.f22481b).mo5593a() && ((Integer) this.f22483d) == null) {
            xy4.m12788q("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((l51) this.f22481b).mo5593a() && ((Integer) this.f22483d) != null) {
            xy4.m12788q("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C0973o7 c0973o7 = ((l51) this.f22481b).f23795d;
        if (c0973o7 == C0973o7.f26396v) {
            u50VarM7410a = k63.f22941a;
        } else if (c0973o7 == C0973o7.f26395u || c0973o7 == C0973o7.f26394t) {
            u50VarM7410a = k63.m7410a(((Integer) this.f22483d).intValue());
        } else {
            if (c0973o7 != C0973o7.f26393s) {
                wb1.m12197q(((l51) this.f22481b).f23795d, "Unknown EcdsaParameters.Variant: ");
                return null;
            }
            u50VarM7410a = k63.m7411b(((Integer) this.f22483d).intValue());
        }
        l51 l51Var2 = (l51) this.f22481b;
        ECPoint eCPoint2 = (ECPoint) this.f22482c;
        Integer num = (Integer) this.f22483d;
        t51 t51Var = new t51();
        t51Var.f30785u = l51Var2;
        t51Var.f30786v = eCPoint2;
        t51Var.f30787w = u50VarM7410a;
        t51Var.f30788x = num;
        VarHandle.storeStoreFence();
        return t51Var;
    }

    /* JADX INFO: renamed from: l */
    public tw1 m7243l() throws GeneralSecurityException {
        wd3 wd3Var;
        u50 u50VarM7410a;
        zw1 zw1Var = (zw1) this.f22481b;
        if (zw1Var == null || (wd3Var = (wd3) this.f22482c) == null) {
            xy4.m12788q("Cannot build without parameters and/or key material");
            return null;
        }
        if (zw1Var.f36424a != ((u50) wd3Var.f33259b).f31654a.length) {
            xy4.m12788q("Key size mismatch");
            return null;
        }
        if (zw1Var.mo5593a() && ((Integer) this.f22483d) == null) {
            xy4.m12788q("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((zw1) this.f22481b).mo5593a() && ((Integer) this.f22483d) != null) {
            xy4.m12788q("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        yw1 yw1Var = ((zw1) this.f22481b).f36426c;
        if (yw1Var == yw1.f35564e) {
            u50VarM7410a = k63.f22941a;
        } else if (yw1Var == yw1.f35563d || yw1Var == yw1.f35562c) {
            u50VarM7410a = k63.m7410a(((Integer) this.f22483d).intValue());
        } else {
            if (yw1Var != yw1.f35561b) {
                wb1.m12197q(((zw1) this.f22481b).f36426c, "Unknown HmacParameters.Variant: ");
                return null;
            }
            u50VarM7410a = k63.m7411b(((Integer) this.f22483d).intValue());
        }
        zw1 zw1Var2 = (zw1) this.f22481b;
        wd3 wd3Var2 = (wd3) this.f22482c;
        Integer num = (Integer) this.f22483d;
        tw1 tw1Var = new tw1();
        tw1Var.f31482u = zw1Var2;
        tw1Var.f31483v = wd3Var2;
        tw1Var.f31484w = u50VarM7410a;
        tw1Var.f31485x = num;
        VarHandle.storeStoreFence();
        return tw1Var;
    }

    /* JADX INFO: renamed from: o */
    public boolean m7244o(wf2 wf2Var) {
        return !(wf2Var.f33319i == null) && (((ha4) ((ar3) this.f22481b).f14813b).contains(wf2Var) || ((ha4) ((ar3) this.f22482c).f14813b).contains(wf2Var));
    }

    /* JADX INFO: renamed from: p */
    public C1380yt m7245p(String str) {
        Context context = (Context) this.f22481b;
        ja0 ja0Var = (ja0) this.f22482c;
        ja0 ja0Var2 = (ja0) this.f22483d;
        C1380yt c1380yt = new C1380yt();
        if (context == null) {
            xy4.m12782k("Null applicationContext");
            return null;
        }
        c1380yt.f35508a = context;
        if (ja0Var == null) {
            xy4.m12782k("Null wallClock");
            return null;
        }
        c1380yt.f35509b = ja0Var;
        if (ja0Var2 == null) {
            xy4.m12782k("Null monotonicClock");
            return null;
        }
        c1380yt.f35510c = ja0Var2;
        if (str == null) {
            xy4.m12782k("Null backendName");
            return null;
        }
        c1380yt.f35511d = str;
        VarHandle.storeStoreFence();
        return c1380yt;
    }

    /* JADX INFO: renamed from: s */
    public hf0 m7246s() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        m7210n();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strM7212r = m7212r((String) this.f22482c, (HashMap) this.f22481b);
            String strConcat = "GET Request URL: ".concat(strM7212r);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strConcat, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(strM7212r).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.f22483d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int i = bufferedReader.read(cArr);
                            if (i == -1) {
                                break;
                            }
                            sb.append(cArr, 0, i);
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                hf0 hf0Var = new hf0((byte) 1);
                hf0Var.f20528b = responseCode;
                hf0Var.f20529c = string;
                VarHandle.storeStoreFence();
                return hf0Var;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public String toString() {
        switch (this.f22480a) {
            case 26:
                wd2 wd2VarM7215A = m7215A();
                int i = aw4.f14920a;
                zd2 zd2VarM3984y = ce2.m3984y();
                int iM12229B = wd2VarM7215A.m12229B();
                zd2VarM3984y.m9631e();
                ((ce2) zd2VarM3984y.f27912b).m3986z(iM12229B);
                for (vd2 vd2Var : wd2VarM7215A.m12228A()) {
                    ae2 ae2VarM3553x = be2.m3553x();
                    String strM10292z = vd2Var.m11812x().m10292z();
                    ae2VarM3553x.m9631e();
                    ((be2) ae2VarM3553x.f27912b).m3555B(strM10292z);
                    hd2 hd2VarM11806A = vd2Var.m11806A();
                    ae2VarM3553x.m9631e();
                    ((be2) ae2VarM3553x.f27912b).m3554A(hd2VarM11806A);
                    j63 j63VarM11814z = vd2Var.m11814z();
                    ae2VarM3553x.m9631e();
                    ((be2) ae2VarM3553x.f27912b).m3557z(j63VarM11814z);
                    int iM11813y = vd2Var.m11813y();
                    ae2VarM3553x.m9631e();
                    ((be2) ae2VarM3553x.f27912b).m3556y(iM11813y);
                    be2 be2Var = (be2) ae2VarM3553x.m9628b();
                    zd2VarM3984y.m9631e();
                    ((ce2) zd2VarM3984y.f27912b).m3985x(be2Var);
                }
                return ((ce2) zd2VarM3984y.m9628b()).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public yd2 m7247v(int i) {
        List list = (List) this.f22481b;
        if (i < 0 || i >= list.size()) {
            xd2.m12665l(list.size(), c75.m3883o("Invalid index ", i, " for keyset of size "));
            return null;
        }
        yd2 yd2Var = (yd2) list.get(i);
        if (!m7202H(yd2Var.f35129b)) {
            C1077qn.m9989o(c75.m3878j("Keyset-Entry at position ", i, " has wrong status"));
            return null;
        }
        if (!yd2Var.f35133f) {
            return (yd2) list.get(i);
        }
        C1077qn.m9989o(c75.m3878j("Keyset-Entry at position ", i, " didn't parse correctly"));
        return null;
    }

    /* JADX INFO: renamed from: w */
    public h70 m7248w() {
        return ((j70) this.f22483d).f22063a.f21148c;
    }

    /* JADX INFO: renamed from: x */
    public zm2 m7249x() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((f70) this.f22483d)) {
            try {
                zm2 zm2Var = (zm2) this.f22482c;
                if (zm2Var != null && localeList == ((LocaleList) this.f22481b)) {
                    return zm2Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new ym2(localeList.get(i)));
                }
                zm2 zm2Var2 = new zm2(arrayList);
                this.f22481b = localeList;
                this.f22482c = zm2Var2;
                return zm2Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public ky0 m7250y() {
        return ((j70) this.f22483d).f22063a.f21146a;
    }

    /* JADX INFO: renamed from: z */
    public ld2 m7251z() {
        ld2 ld2Var = (ld2) this.f22482c;
        if (ld2Var != null) {
            return ld2Var;
        }
        z62.m13366Y("keyboardActions");
        throw null;
    }

    public /* synthetic */ jp0(Object obj, Object obj2, Object obj3, byte b) {
        this.f22480a = b;
        this.f22481b = obj;
        this.f22482c = obj2;
        this.f22483d = obj3;
    }

    public /* synthetic */ jp0(boolean z) {
        this.f22480a = (byte) 18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jp0(byte b) {
        this(new long[10], new long[10], new long[10], (byte) 18);
        this.f22480a = b;
        switch (b) {
            case 19:
                this.f22481b = new lw2();
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jp0(z32 z32Var) {
        this((byte) 18);
        this.f22480a = (byte) 18;
        m7214u(this, z32Var);
    }

    public jp0(URL url, C0623es c0623es, String str) {
        this.f22480a = (byte) 13;
        this.f22481b = url;
        this.f22483d = c0623es;
        this.f22482c = str;
    }

    public /* synthetic */ jp0(byte b, boolean z) {
        this.f22480a = b;
    }
}
