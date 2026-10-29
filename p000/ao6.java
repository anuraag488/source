package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ao6 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f14752c = 0;

    /* JADX INFO: renamed from: a */
    public mq6 f14753a;

    /* JADX INFO: renamed from: b */
    public boolean f14754b;

    static {
        mq6 mq6Var = new mq6();
        ao6 ao6Var = new ao6();
        ao6Var.f14753a = mq6Var;
        ao6Var.m3102a();
        ao6Var.m3102a();
        VarHandle.storeStoreFence();
    }

    /* JADX INFO: renamed from: b */
    public static void m3101b(in6 in6Var, uq6 uq6Var, int i, Object obj) {
        if (uq6Var == uq6.f32110e) {
            in6Var.m6843w(i, 3);
            ((hm6) obj).mo6448a(in6Var);
            in6Var.m6843w(i, 4);
            return;
        }
        in6Var.m6843w(i, uq6Var.f32113b);
        ar6 ar6Var = ar6.f14827a;
        switch (uq6Var.ordinal()) {
            case 0:
                in6Var.m6839s(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                in6Var.m6837q(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                in6Var.m6827A(((Long) obj).longValue());
                break;
            case 3:
                in6Var.m6827A(((Long) obj).longValue());
                break;
            case 4:
                in6Var.m6841u(((Integer) obj).intValue());
                break;
            case 5:
                in6Var.m6839s(((Long) obj).longValue());
                break;
            case 6:
                in6Var.m6837q(((Integer) obj).intValue());
                break;
            case 7:
                byte bBooleanValue = ((Boolean) obj).booleanValue();
                if (in6Var.f21600d == in6Var.f21599c) {
                    in6Var.m6829i();
                }
                byte[] bArr = in6Var.f21598b;
                int i2 = in6Var.f21600d;
                bArr[i2] = bBooleanValue;
                in6Var.f21600d = i2 + 1;
                break;
            case 8:
                if (!(obj instanceof ym6)) {
                    in6Var.m6842v((String) obj);
                } else {
                    in6Var.m6835o((ym6) obj);
                }
                break;
            case 9:
                ((hm6) obj).mo6448a(in6Var);
                break;
            case 10:
                hm6 hm6Var = (hm6) obj;
                in6Var.m6845y(hm6Var.mo6451d());
                hm6Var.mo6448a(in6Var);
                break;
            case 11:
                if (!(obj instanceof ym6)) {
                    byte[] bArr2 = (byte[]) obj;
                    int length = bArr2.length;
                    in6Var.m6845y(length);
                    in6Var.m6828B(length, bArr2);
                } else {
                    in6Var.m6835o((ym6) obj);
                }
                break;
            case 12:
                in6Var.m6845y(((Integer) obj).intValue());
                break;
            case 13:
                in6Var.m6841u(((Integer) obj).intValue());
                break;
            case 14:
                in6Var.m6837q(((Integer) obj).intValue());
                break;
            case 15:
                in6Var.m6839s(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                in6Var.m6845y((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                in6Var.m6827A((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3102a() {
        if (this.f14754b) {
            return;
        }
        mq6 mq6Var = this.f14753a;
        int i = mq6Var.f25156b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = mq6Var.m8380c(i2).f26042b;
            if (obj instanceof jo6) {
                jo6 jo6Var = (jo6) obj;
                zp6.f36259c.m13720a(jo6Var.getClass()).mo7578a(jo6Var);
                jo6Var.m7201k();
            }
        }
        Iterator it = mq6Var.m8378a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof jo6) {
                jo6 jo6Var2 = (jo6) value;
                zp6.f36259c.m13720a(jo6Var2.getClass()).mo7578a(jo6Var2);
                jo6Var2.m7201k();
            }
        }
        if (!mq6Var.f25158d) {
            if (mq6Var.f25156b > 0) {
                throw null;
            }
            Iterator it2 = mq6Var.m8378a().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                xy4.m12778e();
                return;
            }
        }
        if (!mq6Var.f25158d) {
            mq6Var.f25157c = mq6Var.f25157c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(mq6Var.f25157c);
            mq6Var.f25160f = mq6Var.f25160f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(mq6Var.f25160f);
            mq6Var.f25158d = true;
        }
        this.f14754b = true;
    }

    public final Object clone() {
        ao6 ao6Var = new ao6();
        ao6Var.f14753a = new mq6();
        mq6 mq6Var = this.f14753a;
        if (mq6Var.f25156b > 0) {
            throw null;
        }
        Iterator it = mq6Var.m8378a().iterator();
        if (!it.hasNext()) {
            return ao6Var;
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
        if (obj instanceof ao6) {
            return this.f14753a.equals(((ao6) obj).f14753a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14753a.hashCode();
    }
}
