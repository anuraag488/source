package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import essentials.app.EsActivity;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class nh3 implements m24, le4, b04, ce4, d70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25809a;

    /* JADX INFO: renamed from: b */
    public Object f25810b;

    /* JADX INFO: renamed from: c */
    public Object f25811c;

    public nh3(hg1 hg1Var, sg1 sg1Var, wo5 wo5Var, uj0 uj0Var, Context context, gk0 gk0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f25809a = (byte) 6;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f25810b = copyOnWriteArraySet;
        ek0 ek0Var = new ek0();
        ek0Var.f18151a = copyOnWriteArraySet;
        ek0Var.f18152b = false;
        ek0Var.f18158h = scheduledExecutorService;
        ek0Var.f18165o = new Random();
        ek0Var.f18153c = Math.max(8 - gk0Var.m6012c().f19051a, 1);
        ek0Var.f18166p = ia5.f21219j;
        ek0Var.f18160j = hg1Var;
        ek0Var.f18159i = wo5Var;
        ek0Var.f18161k = sg1Var;
        ek0Var.f18162l = uj0Var;
        ek0Var.f18163m = context;
        ek0Var.f18164n = "firebase";
        ek0Var.f18167q = gk0Var;
        ek0Var.f18154d = false;
        ek0Var.f18155e = false;
        ek0Var.f18168r = new Object();
        VarHandle.storeStoreFence();
        this.f25811c = ek0Var;
    }

    /* JADX INFO: renamed from: C */
    public static void m8731C(nh3 nh3Var, z32 z32Var) {
        jp0 jp0Var = (jp0) nh3Var.f25810b;
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
        kx5.m7697a0((long[]) nh3Var.f25811c, (long[]) jp0Var2.f22481b, (long[]) jp0Var2.f22482c);
    }

    /* JADX INFO: renamed from: d */
    public static nh3 m8732d(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    nh3 nh3Var = new nh3((byte) 9, false);
                    nh3Var.f25810b = channel;
                    nh3Var.f25811c = fileLockLock;
                    VarHandle.storeStoreFence();
                    return nh3Var;
                } catch (IOException | Error | OverlappingFileLockException e) {
                    e = e;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e2) {
                e = e2;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            channel = null;
            fileLockLock = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static z91 m8733k() {
        z91 z91Var = new z91();
        z91Var.f35879a = new HashMap();
        z91Var.f35880b = new HashMap();
        return z91Var;
    }

    /* JADX INFO: renamed from: l */
    public static nh3 m8734l(jd2 jd2Var) {
        return new nh3(jd2Var, yv4.m13266c(jd2Var.m7076z()));
    }

    /* JADX INFO: renamed from: A */
    public void m8735A(pn1 pn1Var, boolean z) {
        pn1 pn1Var2 = ((eo1) this.f25810b).f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8735A(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m8736B(pn1 pn1Var, boolean z) {
        pn1 pn1Var2 = ((eo1) this.f25810b).f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8736B(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public Object m8737D(Enum r1) throws GeneralSecurityException {
        Object obj = ((Map) this.f25810b).get(r1);
        if (obj != null) {
            return obj;
        }
        xd2.m12666m(r1, "Unable to convert proto enum: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX INFO: renamed from: E */
    public CctBackendFactory m8738E(String str) {
        Bundle bundle;
        Object obj;
        Map map = (Map) this.f25811c;
        if (map == null) {
            Context context = (Context) this.f25810b;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f25811c = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f25811c = map;
        }
        String str4 = (String) map.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: F */
    public xq2 m8739F() {
        return (xq2) ((d83) this.f25811c).getValue();
    }

    /* JADX INFO: renamed from: G */
    public cg2 m8740G() {
        jg2 jg2Var = (jg2) this.f25810b;
        wf2 wf2Var = (wf2) jg2Var.f22239j.m8132g(this.f25811c);
        if (wf2Var != null) {
            return (cg2) jg2Var.f22235f.m8132g(wf2Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public AutofillId m8741H(long j) {
        return ((ContentCaptureSession) this.f25810b).newAutofillId((AutofillId) c20.m3821q((View) this.f25811c).f14813b, j);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: I */
    public void m8742I(java.lang.String r27, java.util.ArrayList r28) {
        /*
            Method dump skipped, instruction units count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nh3.m8742I(java.lang.String, java.util.ArrayList):void");
    }

    /* JADX INFO: renamed from: J */
    public void m8743J() {
        try {
            ((FileLock) this.f25811c).release();
            ((FileChannel) this.f25810b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m8744K(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f25810b = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: L */
    public Enum m8745L(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) ((Map) this.f25811c).get(obj);
        if (r0 != null) {
            return r0;
        }
        xd2.m12666m(obj, "Unable to convert object enum: ");
        return null;
    }

    /* JADX INFO: renamed from: M */
    public void m8746M() {
        synchronized (this) {
            ((AtomicInteger) this.f25810b).decrementAndGet();
            if (((AtomicInteger) this.f25810b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    @Override // p000.m24
    /* JADX INFO: renamed from: a */
    public u50 mo8194a() {
        return (u50) this.f25810b;
    }

    @Override // p000.ce4
    public de4 apply() {
        jg2 jg2Var = (jg2) this.f25810b;
        cg2 cg2VarM8740G = m8740G();
        if (cg2VarM8740G != null) {
            jg2Var.m7092b(cg2VarM8740G, false);
        }
        return jg2Var.m7093f(this.f25811c);
    }

    @Override // p000.b04
    /* JADX INFO: renamed from: b */
    public int mo3386b(int i) {
        TextPaint textPaint = (TextPaint) this.f25811c;
        CharSequence charSequence = (CharSequence) this.f25810b;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    @Override // p000.b04
    /* JADX INFO: renamed from: c */
    public int mo3387c(int i) {
        TextPaint textPaint = (TextPaint) this.f25811c;
        CharSequence charSequence = (CharSequence) this.f25810b;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // p000.ce4, p000.d70
    public void cancel() {
        switch (this.f25809a) {
            case 19:
                cg2 cg2VarM8740G = m8740G();
                if ((cg2VarM8740G != null ? cg2VarM8740G.f16002f : null) != null) {
                    ((jg2) this.f25810b).m7095h(this.f25811c);
                }
                break;
            default:
                if (!((C1339xp) this.f25811c).compareAndSet(1, 1)) {
                    ((C1048pv) this.f25810b).invoke();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public xk4 m8747e(List list) {
        a71 a71Var;
        Exception e;
        byte b = 0;
        try {
            int size = list.size();
            int i = 0;
            a71Var = null;
            while (i < size) {
                try {
                    a71 a71Var2 = (a71) list.get(i);
                    try {
                        a71Var2.mo117a((c71) this.f25811c);
                        i++;
                        a71Var = a71Var2;
                    } catch (Exception e2) {
                        e = e2;
                        a71Var = a71Var2;
                        StringBuilder sb = new StringBuilder();
                        int iM8598b = ((c71) this.f25811c).f15850a.m8598b();
                        ql4 ql4VarM3859c = ((c71) this.f25811c).m3859c();
                        c71 c71Var = (c71) this.f25811c;
                        sb.append("Error while applying EditCommand batch to buffer (length=" + iM8598b + ", composition=" + ql4VarM3859c + ", selection=" + ql4.m9905i(sc6.m10657b(c71Var.f15851b, c71Var.f15852c)) + "):");
                        sb.append('\n');
                        b71 b71Var = new b71(b);
                        b71Var.f15141b = a71Var;
                        VarHandle.storeStoreFence();
                        hb0.m6304P0(list, sb, "\n", b71Var, 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            c71 c71Var2 = (c71) this.f25811c;
            c71Var2.getClass();
            C0875lk c0875lk = new C0875lk(c71Var2.f15850a.toString());
            c71 c71Var3 = (c71) this.f25811c;
            long jM10657b = sc6.m10657b(c71Var3.f15851b, c71Var3.f15852c);
            ql4 ql4VarM9897a = ql4.m9904h(((xk4) this.f25810b).f34342b) ? null : ql4.m9897a(jM10657b);
            xk4 xk4Var = new xk4(c0875lk, ql4VarM9897a != null ? ql4VarM9897a.f28558a : sc6.m10657b(ql4.m9902f(jM10657b), ql4.m9903g(jM10657b)), ((c71) this.f25811c).m3859c());
            this.f25810b = xk4Var;
            return xk4Var;
        } catch (Exception e4) {
            a71Var = null;
            e = e4;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m8748f() {
        synchronized (this) {
            if (((AtomicBoolean) this.f25811c).get()) {
                return false;
            }
            ((AtomicInteger) this.f25810b).incrementAndGet();
            return true;
        }
    }

    /* JADX INFO: renamed from: g */
    public C1137s9 m8749g() {
        Integer num = (Integer) this.f25810b;
        if (num == null) {
            xy4.m12788q("Key size is not set");
            return null;
        }
        if (((C0641f8) this.f25811c) == null) {
            xy4.m12788q("Variant is not set");
            return null;
        }
        int iIntValue = num.intValue();
        C0641f8 c0641f8 = (C0641f8) this.f25811c;
        C1137s9 c1137s9 = new C1137s9();
        c1137s9.f29996a = iIntValue;
        c1137s9.f29997b = c0641f8;
        VarHandle.storeStoreFence();
        return c1137s9;
    }

    @Override // p000.b04
    /* JADX INFO: renamed from: h */
    public int mo3388h(int i) {
        TextPaint textPaint = (TextPaint) this.f25811c;
        CharSequence charSequence = (CharSequence) this.f25810b;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        if (textRunCursor == -1 || ((TextPaint) this.f25811c).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 0) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    @Override // p000.b04
    /* JADX INFO: renamed from: i */
    public int mo3389i(int i) {
        TextPaint textPaint = (TextPaint) this.f25811c;
        CharSequence charSequence = (CharSequence) this.f25810b;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        if (textRunCursor == -1 || ((TextPaint) this.f25811c).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 2) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    /* JADX INFO: renamed from: j */
    public p51 m8750j() throws GeneralSecurityException {
        ECPoint eCPoint;
        t51 t51Var = (t51) this.f25810b;
        if (t51Var == null) {
            xy4.m12788q("Cannot build without a ecdsa public key");
            return null;
        }
        w42 w42Var = (w42) this.f25811c;
        if (w42Var == null) {
            xy4.m12788q("Cannot build without a private value");
            return null;
        }
        BigInteger bigInteger = (BigInteger) w42Var.f33090b;
        ECPoint eCPoint2 = t51Var.f30786v;
        k51 k51Var = t51Var.f30785u.f23793b;
        BigInteger order = k51Var.f22901b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            xy4.m12788q("Invalid private value");
            return null;
        }
        ECParameterSpec eCParameterSpec = k51Var.f22901b;
        if (!k71.m7417f(eCParameterSpec, k71.f22950a) && !k71.m7417f(eCParameterSpec, k71.f22951b) && !k71.m7417f(eCParameterSpec, k71.f22952c)) {
            xy4.m12788q("spec must be NIST P256, P384 or P521");
            return null;
        }
        if (bigInteger.signum() != 1) {
            xy4.m12788q("k must be positive");
            return null;
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            xy4.m12788q("k must be smaller than the order of the generator");
            return null;
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        k71.m7413b(generator, curve);
        BigInteger a = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerM7415d = k71.m7415d(curve);
        j71 j71VarM7418g = k71.m7418g(ECPoint.POINT_INFINITY, bigIntegerM7415d);
        j71 j71VarM7418g2 = k71.m7418g(generator, bigIntegerM7415d);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                j71VarM7418g = k71.m7412a(j71VarM7418g, j71VarM7418g2, a, bigIntegerM7415d);
                j71VarM7418g2 = k71.m7414c(j71VarM7418g2, a, bigIntegerM7415d);
            } else {
                j71VarM7418g2 = k71.m7412a(j71VarM7418g, j71VarM7418g2, a, bigIntegerM7415d);
                j71VarM7418g = k71.m7414c(j71VarM7418g, a, bigIntegerM7415d);
            }
        }
        if (j71VarM7418g.f22070c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = j71VarM7418g.f22070c.modInverse(bigIntegerM7415d);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerM7415d);
            eCPoint = new ECPoint(j71VarM7418g.f22068a.multiply(bigIntegerMod).mod(bigIntegerM7415d), j71VarM7418g.f22069b.multiply(bigIntegerMod).mod(bigIntegerM7415d).multiply(bigIntegerModInverse).mod(bigIntegerM7415d));
        }
        k71.m7413b(eCPoint, curve);
        if (!eCPoint.equals(eCPoint2)) {
            xy4.m12788q("Invalid private value");
            return null;
        }
        t51 t51Var2 = (t51) this.f25810b;
        w42 w42Var2 = (w42) this.f25811c;
        p51 p51Var = new p51();
        p51Var.f27380u = t51Var2;
        p51Var.f27381v = w42Var2;
        VarHandle.storeStoreFence();
        return p51Var;
    }

    @Override // p000.ce4
    /* JADX INFO: renamed from: m */
    public boolean mo3992m() {
        n93 n93Var;
        cg2 cg2VarM8740G = m8740G();
        if (cg2VarM8740G == null || (n93Var = cg2VarM8740G.f16002f) == null) {
            return true;
        }
        return n93Var.m8633c();
    }

    @Override // p000.le4
    /* JADX INFO: renamed from: n */
    public nr6 mo3146n(Object obj) {
        Boolean bool = (Boolean) obj;
        np0 np0Var = (np0) this.f25811c;
        if (!bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            if1 if1Var = np0Var.f25999g;
            Iterator it = if1.m6785f(((File) if1Var.f21326c).listFiles(np0.f25991r)).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            if1 if1Var2 = ((wq0) np0Var.f26005m.f17868b).f33605b;
            wq0.m12369a(if1.m6785f(((File) if1Var2.f21328e).listFiles()));
            wq0.m12369a(if1.m6785f(((File) if1Var2.f21329f).listFiles()));
            wq0.m12369a(if1.m6785f(((File) if1Var2.f21330g).listFiles()));
            np0Var.f26009q.m7990c(null);
            return y62.m12936B(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean zBooleanValue = bool.booleanValue();
        bt0 bt0Var = np0Var.f25994b;
        if (!zBooleanValue) {
            C1077qn.m9989o("An invalid data collection token was used.");
            return null;
        }
        ((li4) bt0Var.f15568e).m7990c(null);
        nr6 nr6Var = (nr6) this.f25810b;
        yq0 yq0Var = (yq0) np0Var.f25997e.f22481b;
        js1 js1Var = new js1();
        js1Var.f22555a = this;
        VarHandle.storeStoreFence();
        return nr6Var.m8827k(yq0Var, js1Var);
    }

    @Override // p000.ce4
    /* JADX INFO: renamed from: o */
    public boolean mo3993o(C1163sz c1163sz) {
        cg2 cg2VarM8740G = m8740G();
        n93 n93Var = cg2VarM8740G != null ? cg2VarM8740G.f16002f : null;
        if (n93Var == null || n93Var.m8633c()) {
            return true;
        }
        e94 e94VarM5353c0 = ev0.m5353c0();
        yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
        e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
        try {
            boolean zM8635e = n93Var.m8635e(c1163sz);
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            return zM8635e;
        } catch (Throwable th) {
            try {
                cg2VarM8740G.getClass();
                throw th;
            } catch (Throwable th2) {
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m8751p(pn1 pn1Var, boolean z) {
        pn1 pn1Var2 = ((eo1) this.f25810b).f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8751p(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m8752q(pn1 pn1Var, boolean z) {
        eo1 eo1Var = (eo1) this.f25810b;
        EsActivity esActivity = eo1Var.f18326w.f29431v;
        pn1 pn1Var2 = eo1Var.f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8752q(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m8753r(pn1 pn1Var, boolean z) {
        pn1 pn1Var2 = ((eo1) this.f25810b).f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8753r(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m8754s(pn1 pn1Var, boolean z) {
        pn1 pn1Var2 = ((eo1) this.f25810b).f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8754s(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m8755t(pn1 pn1Var, boolean z) {
        pn1 pn1Var2 = ((eo1) this.f25810b).f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8755t(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m8756u(pn1 pn1Var, boolean z) {
        pn1 pn1Var2 = ((eo1) this.f25810b).f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8756u(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m8757v(pn1 pn1Var, boolean z) {
        eo1 eo1Var = (eo1) this.f25810b;
        EsActivity esActivity = eo1Var.f18326w.f29431v;
        pn1 pn1Var2 = eo1Var.f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8757v(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m8758w(pn1 pn1Var, boolean z) {
        pn1 pn1Var2 = ((eo1) this.f25810b).f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8758w(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m8759x(pn1 pn1Var, boolean z) {
        pn1 pn1Var2 = ((eo1) this.f25810b).f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8759x(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m8760y(pn1 pn1Var, Bundle bundle, boolean z) {
        pn1 pn1Var2 = ((eo1) this.f25810b).f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8760y(pn1Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m8761z(pn1 pn1Var, boolean z) {
        pn1 pn1Var2 = ((eo1) this.f25810b).f18328y;
        if (pn1Var2 != null) {
            pn1Var2.m9579g().f18318o.m8761z(pn1Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f25811c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                xy4.m12778e();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public /* synthetic */ nh3(Object obj, Object obj2, byte b) {
        this.f25809a = b;
        this.f25810b = obj;
        this.f25811c = obj2;
    }

    public nh3(String str, i25 i25Var, gb5 gb5Var) {
        this.f25809a = (byte) 3;
        this.f25811c = str;
        this.f25810b = i25Var;
    }

    public nh3(jd2 jd2Var, u50 u50Var) {
        this.f25809a = (byte) 0;
        this.f25811c = jd2Var;
        this.f25810b = u50Var;
    }

    public /* synthetic */ nh3(byte b, boolean z) {
        this.f25809a = b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nh3(byte b) {
        this((Object) new jp0((byte) 18), (Object) new long[10], (byte) 13);
        this.f25809a = b;
        switch (b) {
            case 27:
                this.f25811c = new float[64];
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nh3(z32 z32Var) {
        this((byte) 13);
        this.f25809a = (byte) 13;
        m8731C(this, z32Var);
    }
}
