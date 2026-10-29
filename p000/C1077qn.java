package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: qn */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1077qn implements InterfaceC1262vn, d70, sf3, y73, w73, gd2, ed2, b90, k11, l23 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28617a;

    public /* synthetic */ C1077qn(byte b) {
        this.f28617a = b;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9983c() {
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m9984h(int i, String str, int i2) {
        throw new IllegalArgumentException((str + i + ((char) i2)).toString());
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m9985k(Object obj) {
        throw new AssertionError(obj);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m9986l(Object obj, String str) {
        throw new ia2(str + ((Object) obj.toString()));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m9987m(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m9988n(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m9989o(String str) {
        throw new IllegalStateException(str);
    }

    @Override // p000.w73
    /* JADX INFO: renamed from: a */
    public t73 mo4669a(nh3 nh3Var) throws GeneralSecurityException {
        jd2 jd2Var = (jd2) nh3Var.f25811c;
        if (!jd2Var.m7076z().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            xy4.m12781j(jd2Var.m7076z(), "Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ");
            return null;
        }
        try {
            t70.m10987y(jd2Var.m7071A(), qc1.m9861a());
            return v70.m11755b(w70.m12152b(jd2Var.m7075y()));
        } catch (h72 e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    @Override // p000.sf3
    /* JADX INFO: renamed from: b */
    public Object mo4670b(se0 se0Var) throws GeneralSecurityException {
        r70 r70Var = (r70) se0Var;
        try {
            o70.m8976a();
            Cipher cipherM8976a = o70.m8976a();
            byte[] bArrM11250c = ((u50) r70Var.f29060v.f33259b).m11250c();
            r70Var.f29061w.m11250c();
            cipherM8976a.getProvider();
            o70 o70Var = new o70();
            if (!zi4.m13603c(1)) {
                xy4.m12788q("Can not use ChaCha20Poly1305 in FIPS-mode.");
                return null;
            }
            if (bArrM11250c.length != 32) {
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            new SecretKeySpec(bArrM11250c, "ChaCha20");
            return o70Var;
        } catch (GeneralSecurityException unused) {
            byte[] bArrM11250c2 = ((u50) r70Var.f29060v.f33259b).m11250c();
            r70Var.f29061w.m11250c();
            C0678g7 c0678g7 = new C0678g7();
            new f42(bArrM11250c2, (byte) 0);
            return c0678g7;
        }
    }

    @Override // p000.gd2
    /* JADX INFO: renamed from: d */
    public mh3 mo4672d(se0 se0Var) {
        r70 r70Var = (r70) se0Var;
        p70 p70VarM9749z = q70.m9749z();
        byte[] bArrM11250c = ((u50) r70Var.f29060v.f33259b).m11250c();
        o50 o50VarM10980d = t50.m10980d(bArrM11250c, 0, bArrM11250c.length);
        p70VarM9749z.m9631e();
        ((q70) p70VarM9749z.f27912b).m9750C(o50VarM10980d);
        return mh3.m8323b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((q70) p70VarM9749z.m9628b()).m11693f(), qc2.f28376c, w70.m12151a(r70Var.f29059u.f32438a), r70Var.f29062x);
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: e */
    public double mo7356e(double d) {
        switch (this.f28617a) {
            case 14:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 15:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 16:
                float[] fArr = oc0.f26547a;
                return oc0.m9031b(oc0.f26549c, d);
            case 17:
                float[] fArr2 = oc0.f26547a;
                return oc0.m9030a(oc0.f26549c, d);
            case 18:
                float[] fArr3 = oc0.f26547a;
                return oc0.m9033d(oc0.f26550d, d);
            default:
                float[] fArr4 = oc0.f26547a;
                return oc0.m9032c(oc0.f26550d, d);
        }
    }

    @Override // p000.ed2
    /* JADX INFO: renamed from: f */
    public se0 mo4673f(m24 m24Var) throws GeneralSecurityException {
        mh3 mh3Var = (mh3) m24Var;
        if (!mh3Var.f24917a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            m9987m("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
            return null;
        }
        try {
            q70 q70VarM9747A = q70.m9747A(mh3Var.f24919c, qc1.m9861a());
            if (q70VarM9747A.m9752y() == 0) {
                return r70.m10230l0(w70.m12152b(mh3Var.f24921e), new wd3(u50.m11249b(q70VarM9747A.m9751x().m10981l()), (byte) 8), mh3Var.f24922f);
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (h72 unused) {
            xy4.m12788q("Parsing ChaCha20Poly1305Key failed");
            return null;
        }
    }

    @Override // p000.l23
    /* JADX INFO: renamed from: g */
    public Object mo7823g() {
        switch (this.f28617a) {
            case 21:
                return new pl2(true);
            case 22:
                return new LinkedHashMap();
            case 23:
                return new TreeMap();
            case 24:
                return new ConcurrentHashMap();
            case 25:
                return new ConcurrentSkipListMap();
            case 26:
                return new ArrayList();
            case 27:
                return new LinkedHashSet();
            case 28:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // p000.y73
    /* JADX INFO: renamed from: i */
    public nh3 mo4674i(t73 t73Var) {
        id2 id2VarM7068B = jd2.m7068B();
        id2VarM7068B.m6763g("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        id2VarM7068B.m6764h(t70.m10986x().m11693f());
        id2VarM7068B.m6762f(w70.m12151a(((v70) t73Var).f32438a));
        return nh3.m8734l((jd2) id2VarM7068B.m9628b());
    }

    @Override // p000.InterfaceC1262vn
    /* JADX INFO: renamed from: j */
    public int mo5865j(int i, df2 df2Var) {
        return Math.round((1.0f + 0.0f) * ((i + 0) / 2.0f));
    }

    @Override // p000.d70
    public void cancel() {
    }
}
