package p000;

import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hh6 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f20588c = 0;

    /* JADX INFO: renamed from: a */
    public lk6 f20589a;

    /* JADX INFO: renamed from: b */
    public boolean f20590b;

    static {
        lk6 lk6Var = new lk6();
        hh6 hh6Var = new hh6();
        hh6Var.f20589a = lk6Var;
        hh6Var.m6403a();
        hh6Var.m6403a();
        VarHandle.storeStoreFence();
    }

    /* JADX INFO: renamed from: b */
    public static void m6402b(ng6 ng6Var, tl6 tl6Var, int i, Object obj) throws za0 {
        if (tl6Var == tl6.f31232d) {
            Charset charset = ni6.f25875a;
            ng6Var.m8714c(i, 3);
            ((zh6) ((ef6) obj)).m13565c(ng6Var);
            ng6Var.m8714c(i, 4);
            return;
        }
        ng6Var.m8714c(i, tl6Var.f31235b);
        ul6 ul6Var = ul6.f31979a;
        switch (tl6Var.ordinal()) {
            case 0:
                ng6Var.m8727p(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                ng6Var.m8725n(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                ng6Var.m8726o(((Long) obj).longValue());
                break;
            case 3:
                ng6Var.m8726o(((Long) obj).longValue());
                break;
            case 4:
                ng6Var.m8723l(((Integer) obj).intValue());
                break;
            case 5:
                ng6Var.m8727p(((Long) obj).longValue());
                break;
            case 6:
                ng6Var.m8725n(((Integer) obj).intValue());
                break;
            case 7:
                ng6Var.m8722k(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ig6)) {
                    ng6Var.m8729r((String) obj);
                } else {
                    ng6Var.m8721j((ig6) obj);
                }
                break;
            case 9:
                ((zh6) ((ef6) obj)).m13565c(ng6Var);
                break;
            case 10:
                zh6 zh6Var = (zh6) ((ef6) obj);
                ng6Var.m8724m(zh6Var.m13571i());
                zh6Var.m13565c(ng6Var);
                break;
            case 11:
                if (!(obj instanceof ig6)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    ng6Var.m8724m(length);
                    ng6Var.m8728q(length, bArr);
                } else {
                    ng6Var.m8721j((ig6) obj);
                }
                break;
            case 12:
                ng6Var.m8724m(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof fi6)) {
                    ng6Var.m8723l(((Integer) obj).intValue());
                } else {
                    ng6Var.m8723l(((fi6) obj).mo4016f());
                }
                break;
            case 14:
                ng6Var.m8725n(((Integer) obj).intValue());
                break;
            case 15:
                ng6Var.m8727p(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                ng6Var.m8724m((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                ng6Var.m8726o((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6403a() {
        if (this.f20590b) {
            return;
        }
        lk6 lk6Var = this.f20589a;
        int i = lk6Var.f24112b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = lk6Var.m8002a(i2).f30358b;
            if (obj instanceof zh6) {
                zh6 zh6Var = (zh6) obj;
                bk6.f15375c.m3613a(zh6Var.getClass()).mo6025c(zh6Var);
                zh6Var.m13567e();
            }
        }
        Iterator it = lk6Var.m8003b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zh6) {
                zh6 zh6Var2 = (zh6) value;
                bk6.f15375c.m3613a(zh6Var2.getClass()).mo6025c(zh6Var2);
                zh6Var2.m13567e();
            }
        }
        if (!lk6Var.f24114d) {
            if (lk6Var.f24112b > 0) {
                throw null;
            }
            Iterator it2 = lk6Var.m8003b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                xy4.m12778e();
                return;
            }
        }
        if (!lk6Var.f24114d) {
            lk6Var.f24113c = lk6Var.f24113c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(lk6Var.f24113c);
            lk6Var.f24116f = lk6Var.f24116f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(lk6Var.f24116f);
            lk6Var.f24114d = true;
        }
        this.f20590b = true;
    }

    public final Object clone() {
        hh6 hh6Var = new hh6();
        hh6Var.f20589a = new lk6();
        lk6 lk6Var = this.f20589a;
        if (lk6Var.f24112b > 0) {
            throw null;
        }
        Iterator it = lk6Var.m8003b().iterator();
        if (!it.hasNext()) {
            return hh6Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            xy4.m12778e();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hh6) {
            return this.f20589a.equals(((hh6) obj).f20589a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20589a.hashCode();
    }
}
