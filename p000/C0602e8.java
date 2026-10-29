package p000;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.VarHandle;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: renamed from: e8 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0602e8 implements cg0, dr6 {

    /* JADX INFO: renamed from: a */
    public Object f17867a;

    /* JADX INFO: renamed from: b */
    public Object f17868b;

    /* JADX INFO: renamed from: c */
    public Object f17869c;

    /* JADX INFO: renamed from: d */
    public Object f17870d;

    /* JADX INFO: renamed from: e */
    public Object f17871e;

    /* JADX INFO: renamed from: f */
    public Object f17872f;

    /* JADX INFO: renamed from: h */
    public static C1342xs m4945h(C1342xs c1342xs, z32 z32Var, if1 if1Var, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        C1305ws c1305wsM12754a = c1342xs.m12754a();
        String strMo3001f = ((we1) z32Var.f35739c).mo3001f();
        if (strMo3001f != null) {
            C1083qt c1083qt = new C1083qt();
            c1083qt.f28779a = strMo3001f;
            VarHandle.storeStoreFence();
            c1305wsM12754a.f33673e = c1083qt;
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        C1126rz c1126rz = (C1126rz) if1Var.f21327d;
        if (zIsEmpty) {
            sd2 sd2Var = (sd2) ((AtomicMarkableReference) c1126rz.f29738b).getReference();
            synchronized (sd2Var) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(sd2Var.f30180a));
            }
        } else {
            sd2 sd2Var2 = (sd2) ((AtomicMarkableReference) c1126rz.f29738b).getReference();
            synchronized (sd2Var2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(sd2Var2.f30180a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strM10686a = sd2.m10686a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strM10686a)) {
                    map2.put(strM10686a, sd2.m10686a(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listM4949p = m4949p(mapUnmodifiableMap2);
        sd2 sd2Var3 = (sd2) ((AtomicMarkableReference) ((C1126rz) if1Var.f21328e).f29738b).getReference();
        synchronized (sd2Var3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(sd2Var3.f30180a));
        }
        List listM4949p2 = m4949p(mapUnmodifiableMap3);
        if (!listM4949p.isEmpty() || !listM4949p2.isEmpty()) {
            C1416zs c1416zs = (C1416zs) c1342xs.f34571c;
            C1379ys c1379ys = new C1379ys();
            c1379ys.f35483a = c1416zs.f36331a;
            c1379ys.f35486d = c1416zs.f36334d;
            c1379ys.f35487e = c1416zs.f36335e;
            c1379ys.f35488f = c1416zs.f36336f;
            c1379ys.f35489g = c1416zs.f36337g;
            c1379ys.f35490h = (byte) 1;
            c1379ys.f35484b = listM4949p;
            c1379ys.f35485c = listM4949p2;
            c1305wsM12754a.f33671c = c1379ys.m13230a();
        }
        return c1305wsM12754a.m12388a();
    }

    /* JADX INFO: renamed from: i */
    public static pq0 m4946i(C1342xs c1342xs, if1 if1Var) {
        List listM9236a = ((oq3) if1Var.f21329f).m9236a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listM9236a.size(); i++) {
            nq3 nq3Var = (nq3) listM9236a.get(i);
            nq3Var.getClass();
            C1120rt c1120rt = new C1120rt();
            C1195tu c1195tu = (C1195tu) nq3Var;
            String str = c1195tu.f31439e;
            if (str == null) {
                xy4.m12782k("Null variantId");
                return null;
            }
            String str2 = c1195tu.f31436b;
            if (str2 == null) {
                xy4.m12782k("Null rolloutId");
                return null;
            }
            C1194tt c1194tt = new C1194tt();
            c1194tt.f31402a = str2;
            c1194tt.f31403b = str;
            VarHandle.storeStoreFence();
            c1120rt.f29590a = c1194tt;
            String str3 = c1195tu.f31437c;
            if (str3 == null) {
                xy4.m12782k("Null parameterKey");
                return null;
            }
            c1120rt.f29591b = str3;
            String str4 = c1195tu.f31438d;
            if (str4 == null) {
                xy4.m12782k("Null parameterValue");
                return null;
            }
            c1120rt.f29592c = str4;
            c1120rt.f29593d = c1195tu.f31440f;
            c1120rt.f29594e = (byte) (c1120rt.f29594e | 1);
            arrayList.add(c1120rt.m10424a());
        }
        if (arrayList.isEmpty()) {
            return c1342xs;
        }
        C1305ws c1305wsM12754a = c1342xs.m12754a();
        C1231ut c1231ut = new C1231ut();
        c1231ut.f32150a = arrayList;
        VarHandle.storeStoreFence();
        c1305wsM12754a.f33674f = c1231ut;
        return c1305wsM12754a.m12388a();
    }

    /* JADX INFO: renamed from: m */
    public static String m4947m(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            bufferedInputStream.close();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: n */
    public static C0602e8 m4948n(Context context, q02 q02Var, if1 if1Var, C1372yl c1372yl, z32 z32Var, if1 if1Var2, ys2 ys2Var, C1372yl c1372yl2, nh3 nh3Var, kp0 kp0Var, jp0 jp0Var) {
        uq0 uq0Var = new uq0();
        uq0Var.f32089a = context;
        uq0Var.f32090b = q02Var;
        uq0Var.f32091c = c1372yl;
        uq0Var.f32092d = ys2Var;
        uq0Var.f32093e = c1372yl2;
        VarHandle.storeStoreFence();
        wq0 wq0Var = new wq0();
        wq0Var.f33604a = new AtomicInteger(0);
        wq0Var.f33605b = if1Var;
        wq0Var.f33606c = c1372yl2;
        wq0Var.f33607d = kp0Var;
        VarHandle.storeStoreFence();
        vq0 vq0Var = uu0.f32170b;
        mp4.m8367b(context);
        C1122rv c1122rvM8072a = mp4.m8366a().m8368c(new v50(uu0.f32171c, uu0.f32172d)).m8072a("FIREBASE_CRASHLYTICS_REPORT", j81.m7046a("json"), uu0.f32173e);
        c44 c44VarM13167e = c1372yl2.m13167e();
        double d = c44VarM13167e.f15799d;
        double d2 = c44VarM13167e.f15800e;
        long j = ((long) c44VarM13167e.f15801f) * 1000;
        zn3 zn3Var = new zn3();
        zn3Var.f36199a = d;
        zn3Var.f36200b = d2;
        zn3Var.f36201c = j;
        zn3Var.f36206h = c1122rvM8072a;
        zn3Var.f36207i = nh3Var;
        zn3Var.f36202d = SystemClock.elapsedRealtime();
        int i = (int) d;
        zn3Var.f36203e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        zn3Var.f36204f = arrayBlockingQueue;
        zn3Var.f36205g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        zn3Var.f36208j = 0;
        zn3Var.f36209k = 0L;
        VarHandle.storeStoreFence();
        uu0 uu0Var = new uu0();
        uu0Var.f32174a = zn3Var;
        VarHandle.storeStoreFence();
        C0602e8 c0602e8 = new C0602e8();
        c0602e8.f17867a = uq0Var;
        c0602e8.f17868b = wq0Var;
        c0602e8.f17869c = uu0Var;
        c0602e8.f17870d = z32Var;
        c0602e8.f17871e = if1Var2;
        c0602e8.f17872f = q02Var;
        VarHandle.storeStoreFence();
        return c0602e8;
    }

    /* JADX INFO: renamed from: p */
    public static List m4949p(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                xy4.m12782k("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                xy4.m12782k("Null value");
                return null;
            }
            C0957ns c0957ns = new C0957ns();
            c0957ns.f26063a = str;
            c0957ns.f26064b = str2;
            VarHandle.storeStoreFence();
            arrayList.add(c0957ns);
        }
        Collections.sort(arrayList, new C1254vf((byte) 10));
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p000.cg0
    /* JADX INFO: renamed from: a */
    public Object mo4017a(Class cls) {
        if (!((Set) this.f17867a).contains(ni3.m8779a(cls))) {
            xd2.m12667n("Attempting to request an undeclared dependency ", cls, ".");
            return null;
        }
        Object objMo4017a = ((cg0) this.f17872f).mo4017a(cls);
        if (!cls.equals(ii3.class)) {
            return objMo4017a;
        }
        return new zo3();
    }

    @Override // p000.cg0
    /* JADX INFO: renamed from: b */
    public bi3 mo4018b(ni3 ni3Var) {
        if (((Set) this.f17871e).contains(ni3Var)) {
            return ((cg0) this.f17872f).mo4018b(ni3Var);
        }
        xd2.m12667n("Attempting to request an undeclared dependency Provider<Set<", ni3Var, ">>.");
        return null;
    }

    @Override // p000.cg0
    /* JADX INFO: renamed from: c */
    public Set mo4019c(ni3 ni3Var) {
        if (((Set) this.f17870d).contains(ni3Var)) {
            return ((cg0) this.f17872f).mo4019c(ni3Var);
        }
        xd2.m12667n("Attempting to request an undeclared dependency Set<", ni3Var, ">.");
        return null;
    }

    @Override // p000.cg0
    /* JADX INFO: renamed from: d */
    public bi3 mo4020d(Class cls) {
        return mo4022f(ni3.m8779a(cls));
    }

    @Override // p000.cg0
    /* JADX INFO: renamed from: e */
    public z53 mo4021e(ni3 ni3Var) {
        if (((Set) this.f17869c).contains(ni3Var)) {
            return ((cg0) this.f17872f).mo4021e(ni3Var);
        }
        xd2.m12667n("Attempting to request an undeclared dependency Deferred<", ni3Var, ">.");
        return null;
    }

    @Override // p000.cg0
    /* JADX INFO: renamed from: f */
    public bi3 mo4022f(ni3 ni3Var) {
        if (((Set) this.f17868b).contains(ni3Var)) {
            return ((cg0) this.f17872f).mo4022f(ni3Var);
        }
        xd2.m12667n("Attempting to request an undeclared dependency Provider<", ni3Var, ">.");
        return null;
    }

    @Override // p000.cg0
    /* JADX INFO: renamed from: g */
    public Object mo4023g(ni3 ni3Var) {
        if (((Set) this.f17867a).contains(ni3Var)) {
            return ((cg0) this.f17872f).mo4023g(ni3Var);
        }
        xd2.m12667n("Attempting to request an undeclared dependency ", ni3Var, ".");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public C0679g8 m4950k() {
        if (((Integer) this.f17867a) == null) {
            xy4.m12788q("AES key size is not set");
            return null;
        }
        if (((Integer) this.f17868b) == null) {
            xy4.m12788q("HMAC key size is not set");
            return null;
        }
        if (((Integer) this.f17869c) == null) {
            xy4.m12788q("iv size is not set");
            return null;
        }
        Integer num = (Integer) this.f17870d;
        if (num == null) {
            xy4.m12788q("tag size is not set");
            return null;
        }
        if (((C0641f8) this.f17871e) == null) {
            xy4.m12788q("hash type is not set");
            return null;
        }
        if (((C0973o7) this.f17872f) == null) {
            xy4.m12788q("variant is not set");
            return null;
        }
        int iIntValue = num.intValue();
        C0641f8 c0641f8 = (C0641f8) this.f17871e;
        if (c0641f8 == C0641f8.f18802c) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (c0641f8 == C0641f8.f18803d) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (c0641f8 == C0641f8.f18804e) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (c0641f8 == C0641f8.f18805f) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (c0641f8 != C0641f8.f18806g) {
                xy4.m12788q("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        int iIntValue2 = ((Integer) this.f17867a).intValue();
        int iIntValue3 = ((Integer) this.f17868b).intValue();
        int iIntValue4 = ((Integer) this.f17869c).intValue();
        int iIntValue5 = ((Integer) this.f17870d).intValue();
        C0973o7 c0973o7 = (C0973o7) this.f17872f;
        C0641f8 c0641f9 = (C0641f8) this.f17871e;
        C0679g8 c0679g8 = new C0679g8();
        c0679g8.f19647a = iIntValue2;
        c0679g8.f19648b = iIntValue3;
        c0679g8.f19649c = iIntValue4;
        c0679g8.f19650d = iIntValue5;
        c0679g8.f19651e = c0973o7;
        c0679g8.f19652f = c0641f9;
        VarHandle.storeStoreFence();
        return c0679g8;
    }

    /* JADX INFO: renamed from: l */
    public h35 m4951l() {
        h35 h35Var = new h35();
        q25 q25Var = (q25) this.f17870d;
        h35Var.f20341a = q25Var;
        h35Var.f20342b = (Context) this.f17872f;
        String str = q25Var.f28162a;
        h35Var.f20343c = str;
        h35Var.f20344d = (j25) this.f17868b;
        ik0 ik0Var = (ik0) this.f17867a;
        h35Var.f20345e = ik0Var;
        h35Var.f20346f = ik0Var.f21506c;
        WorkDatabase workDatabase = (WorkDatabase) this.f17869c;
        h35Var.f20347g = workDatabase;
        h35Var.f20348h = workDatabase.mo3080w();
        h35Var.f20349i = workDatabase.mo3063f();
        ArrayList arrayList = (ArrayList) this.f17871e;
        h35Var.f20350j = arrayList;
        String str2 = q25Var.f28164c;
        h35Var.f20351k = zi4.m13623w(zi4.m13625y("Work [ id=", str, ", class=", str2, ", tags={ "), hb0.m6305Q0(arrayList, ",", null, null, 0, null, 62), " } ]");
        h35Var.f20352l = y70.m13021a();
        h35Var.f20354n = new ArrayList();
        h35Var.f20355o = new ArrayList();
        VarHandle.storeStoreFence();
        return h35Var;
    }

    /* JADX INFO: renamed from: o */
    public z53 m4952o(Class cls) {
        return mo4021e(ni3.m8779a(cls));
    }

    /* JADX INFO: renamed from: q */
    public ti3 m4953q(ri3 ri3Var, si3 si3Var, int i, int i2, int i3, int i4, int i5, int i6) {
        C0602e8 c0602e8 = this;
        ri3 ri3Var2 = ri3Var;
        int[] iArr = (int[]) c0602e8.f17868b;
        if (iArr == null) {
            z62.m13366Y("momentsR");
            throw null;
        }
        int iM13837A = zy5.m13837A(ri3Var2, si3Var, iArr);
        int[] iArr2 = (int[]) c0602e8.f17869c;
        if (iArr2 == null) {
            z62.m13366Y("momentsG");
            throw null;
        }
        int iM13837A2 = zy5.m13837A(ri3Var2, si3Var, iArr2);
        int[] iArr3 = (int[]) c0602e8.f17870d;
        if (iArr3 == null) {
            z62.m13366Y("momentsB");
            throw null;
        }
        int iM13837A3 = zy5.m13837A(ri3Var2, si3Var, iArr3);
        int[] iArr4 = (int[]) c0602e8.f17867a;
        if (iArr4 == null) {
            z62.m13366Y("weights");
            throw null;
        }
        int iM13837A4 = zy5.m13837A(ri3Var2, si3Var, iArr4);
        int i7 = -1;
        double d = 0.0d;
        int i8 = i;
        while (i8 < i2) {
            int i9 = iM13837A;
            int[] iArr5 = (int[]) c0602e8.f17868b;
            if (iArr5 == null) {
                z62.m13366Y("momentsR");
                throw null;
            }
            int iM13864a0 = zy5.m13864a0(ri3Var2, si3Var, i8, iArr5) + i9;
            int[] iArr6 = (int[]) c0602e8.f17869c;
            if (iArr6 == null) {
                z62.m13366Y("momentsG");
                throw null;
            }
            int iM13864a1 = zy5.m13864a0(ri3Var2, si3Var, i8, iArr6) + iM13837A2;
            int[] iArr7 = (int[]) c0602e8.f17870d;
            if (iArr7 == null) {
                z62.m13366Y("momentsB");
                throw null;
            }
            int iM13864a2 = zy5.m13864a0(ri3Var2, si3Var, i8, iArr7) + iM13837A3;
            int[] iArr8 = (int[]) c0602e8.f17867a;
            if (iArr8 == null) {
                z62.m13366Y("weights");
                throw null;
            }
            int iM13864a3 = zy5.m13864a0(ri3Var2, si3Var, i8, iArr8) + iM13837A4;
            if (iM13864a3 != 0) {
                double d2 = ((double) ((iM13864a2 * iM13864a2) + ((iM13864a1 * iM13864a1) + (iM13864a0 * iM13864a0)))) / ((double) iM13864a3);
                int i10 = i3 - iM13864a0;
                int i11 = i4 - iM13864a1;
                int i12 = i5 - iM13864a2;
                int i13 = i6 - iM13864a3;
                if (i13 != 0) {
                    double d3 = (((double) ((i12 * i12) + ((i11 * i11) + (i10 * i10)))) / ((double) i13)) + d2;
                    if (d3 > d) {
                        d = d3;
                        i7 = i8;
                    }
                }
            }
            i8++;
            c0602e8 = this;
            ri3Var2 = ri3Var;
            iM13837A = i9;
        }
        ti3 ti3Var = new ti3();
        ti3Var.f31184a = i7;
        ti3Var.f31185b = d;
        return ti3Var;
    }

    /* JADX INFO: renamed from: r */
    public nr6 m4954r(String str, Executor executor) {
        li4 li4Var;
        C0602e8 c0602e8 = this;
        ArrayList arrayListM12372b = ((wq0) c0602e8.f17868b).m12372b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListM12372b.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            File file = (File) arrayListM12372b.get(i);
            try {
                vq0 vq0Var = wq0.f33601g;
                String strM12370e = wq0.m12370e(file);
                vq0Var.getClass();
                arrayList.add(C0809js.m7267a(vq0.m11961i(strM12370e), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            C0809js c0809jsM7267a = (C0809js) obj;
            if (str == null || str.equals(c0809jsM7267a.f22550b)) {
                uu0 uu0Var = (uu0) c0602e8.f17869c;
                C0773is c0773is = c0809jsM7267a.f22549a;
                if (c0773is.f21727f == null || c0773is.f21728g == null) {
                    og1 og1VarM9694b = ((q02) c0602e8.f17872f).m9694b(true);
                    C0773is c0773is2 = c0809jsM7267a.f22549a;
                    String str2 = og1VarM9694b.f26679a;
                    C0736hs c0736hsMo6928a = c0773is2.mo6928a();
                    c0736hsMo6928a.f20814e = str2;
                    C0773is c0773isM6491a = c0736hsMo6928a.m6491a();
                    String str3 = og1VarM9694b.f26680b;
                    C0736hs c0736hsMo6928a2 = c0773isM6491a.mo6928a();
                    c0736hsMo6928a2.f20815f = str3;
                    c0809jsM7267a = C0809js.m7267a(c0736hsMo6928a2.m6491a(), c0809jsM7267a.f22550b, c0809jsM7267a.f22551c);
                }
                boolean z = str != null;
                zn3 zn3Var = uu0Var.f32174a;
                synchronized (zn3Var.f36204f) {
                    try {
                        li4Var = new li4();
                        if (z) {
                            ((AtomicInteger) zn3Var.f36207i.f25810b).getAndIncrement();
                            if (zn3Var.f36204f.size() < zn3Var.f36203e) {
                                ig1 ig1Var = ig1.f21399w;
                                ig1Var.m6798m("Enqueueing report: " + c0809jsM7267a.f22550b, null);
                                ig1Var.m6798m("Queue size: " + zn3Var.f36204f.size(), null);
                                ThreadPoolExecutor threadPoolExecutor = zn3Var.f36205g;
                                yn3 yn3Var = new yn3((byte) 0);
                                yn3Var.f35362d = zn3Var;
                                yn3Var.f35360b = c0809jsM7267a;
                                yn3Var.f35361c = li4Var;
                                VarHandle.storeStoreFence();
                                threadPoolExecutor.execute(yn3Var);
                                ig1Var.m6798m("Closing task for report: " + c0809jsM7267a.f22550b, null);
                                li4Var.m7990c(c0809jsM7267a);
                            } else {
                                zn3Var.m13644a();
                                String str4 = "Dropping report due to queue being full: " + c0809jsM7267a.f22550b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) zn3Var.f36207i.f25811c).getAndIncrement();
                                li4Var.m7990c(c0809jsM7267a);
                            }
                        } else {
                            zn3Var.m13645b(c0809jsM7267a, li4Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                nr6 nr6Var = li4Var.f24059a;
                ds3 ds3Var = new ds3((byte) 18);
                VarHandle.storeStoreFence();
                arrayList2.add(nr6Var.m8821e(executor, ds3Var));
            }
            c0602e8 = this;
        }
        return y62.m12976j0(arrayList2);
    }

    /* JADX INFO: renamed from: s */
    public void m4955s(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f17867a = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: t */
    public void m4956t(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.f17868b = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: u */
    public void m4957u(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.f17869c = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: v */
    public void m4958v(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f17870d = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: w */
    public double m4959w(ri3 ri3Var) {
        int[] iArr = (int[]) this.f17868b;
        if (iArr == null) {
            z62.m13366Y("momentsR");
            throw null;
        }
        int iM13866b0 = zy5.m13866b0(ri3Var, iArr);
        int[] iArr2 = (int[]) this.f17869c;
        if (iArr2 == null) {
            z62.m13366Y("momentsG");
            throw null;
        }
        int iM13866b1 = zy5.m13866b0(ri3Var, iArr2);
        int[] iArr3 = (int[]) this.f17870d;
        if (iArr3 == null) {
            z62.m13366Y("momentsB");
            throw null;
        }
        int iM13866b2 = zy5.m13866b0(ri3Var, iArr3);
        double[] dArr = (double[]) this.f17871e;
        if (dArr == null) {
            z62.m13366Y("moments");
            throw null;
        }
        double d = dArr[zy5.m13848L(ri3Var.f29317b, ri3Var.f29319d, ri3Var.f29321f)];
        double[] dArr2 = (double[]) this.f17871e;
        if (dArr2 == null) {
            z62.m13366Y("moments");
            throw null;
        }
        double d2 = d - dArr2[zy5.m13848L(ri3Var.f29317b, ri3Var.f29319d, ri3Var.f29320e)];
        double[] dArr3 = (double[]) this.f17871e;
        if (dArr3 == null) {
            z62.m13366Y("moments");
            throw null;
        }
        double d3 = d2 - dArr3[zy5.m13848L(ri3Var.f29317b, ri3Var.f29318c, ri3Var.f29321f)];
        double[] dArr4 = (double[]) this.f17871e;
        if (dArr4 == null) {
            z62.m13366Y("moments");
            throw null;
        }
        double d4 = d3 + dArr4[zy5.m13848L(ri3Var.f29317b, ri3Var.f29318c, ri3Var.f29320e)];
        double[] dArr5 = (double[]) this.f17871e;
        if (dArr5 == null) {
            z62.m13366Y("moments");
            throw null;
        }
        double d5 = d4 - dArr5[zy5.m13848L(ri3Var.f29316a, ri3Var.f29319d, ri3Var.f29321f)];
        double[] dArr6 = (double[]) this.f17871e;
        if (dArr6 == null) {
            z62.m13366Y("moments");
            throw null;
        }
        double d6 = d5 + dArr6[zy5.m13848L(ri3Var.f29316a, ri3Var.f29319d, ri3Var.f29320e)];
        double[] dArr7 = (double[]) this.f17871e;
        if (dArr7 == null) {
            z62.m13366Y("moments");
            throw null;
        }
        double d7 = d6 + dArr7[zy5.m13848L(ri3Var.f29316a, ri3Var.f29318c, ri3Var.f29321f)];
        double[] dArr8 = (double[]) this.f17871e;
        if (dArr8 == null) {
            z62.m13366Y("moments");
            throw null;
        }
        double d8 = d7 - dArr8[zy5.m13848L(ri3Var.f29316a, ri3Var.f29318c, ri3Var.f29320e)];
        int i = iM13866b2 * iM13866b2;
        int i2 = i + (iM13866b1 * iM13866b1) + (iM13866b0 * iM13866b0);
        int[] iArr4 = (int[]) this.f17867a;
        if (iArr4 != null) {
            return d8 - (((double) i2) / ((double) zy5.m13866b0(ri3Var, iArr4)));
        }
        z62.m13366Y("weights");
        throw null;
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public C1372yl mo4146j() {
        Application application = (Application) ((C1392z4) this.f17867a).f35744a;
        wu5 wu5Var = (wu5) ((cr6) this.f17868b).mo4146j();
        Handler handler = ky5.f23626a;
        g06.m5881a(handler);
        yq0 yq0Var = ky5.f23627b;
        g06.m5881a(yq0Var);
        c16 c16Var = (c16) ((cr6) this.f17869c).mo4146j();
        C1283w7 c1283w7M6473a = ((hq5) this.f17870d).m6473a();
        ts5 ts5Var = (ts5) ((rr5) this.f17871e).mo4146j();
        mq5 mq5Var = (mq5) ((cr6) this.f17872f).mo4146j();
        C1372yl c1372yl = new C1372yl();
        c1372yl.f35304a = application;
        c1372yl.f35305b = wu5Var;
        c1372yl.f35306c = handler;
        c1372yl.f35307d = yq0Var;
        c1372yl.f35308e = c16Var;
        c1372yl.f35309f = c1283w7M6473a;
        c1372yl.f35310g = ts5Var;
        c1372yl.f35311h = mq5Var;
        VarHandle.storeStoreFence();
        return c1372yl;
    }
}
