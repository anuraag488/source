package p000;

import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0871lg extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f24010t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f24011u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f24012v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f24013w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f24014x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0871lg(Object obj, Object obj2, Object obj3, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f24010t = b;
        this.f24012v = obj;
        this.f24013w = obj2;
        this.f24014x = obj3;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f24010t;
        Object obj2 = this.f24012v;
        Object obj3 = this.f24014x;
        Object obj4 = this.f24013w;
        switch (b) {
            case 0:
                C0871lg c0871lg = new C0871lg(this.f24012v, (C0908mg) obj4, (i92) obj3, wm0Var, (byte) 0);
                c0871lg.f24011u = obj;
                return c0871lg;
            case 1:
                C0871lg c0871lg2 = new C0871lg((Thread) obj2, (wp1) obj4, (Throwable) obj3, wm0Var, (byte) 1);
                c0871lg2.f24011u = obj;
                return c0871lg2;
            case 2:
                C0871lg c0871lg3 = new C0871lg((pc3) obj2, (yj4) obj4, (pk4) obj3, wm0Var, (byte) 2);
                c0871lg3.f24011u = obj;
                return c0871lg3;
            default:
                C0871lg c0871lg4 = new C0871lg(this.f24012v, (xd3) obj4, (e44) obj3, wm0Var, (byte) 3);
                c0871lg4.f24011u = obj;
                return c0871lg4;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24010t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((C0871lg) create((wm0) obj2, (hw2) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            case 1:
                return ((C0871lg) create((wm0) obj2, (List) obj)).invokeSuspend(ju4Var);
            case 2:
                ((C0871lg) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            default:
                ((C0871lg) create((wm0) obj2, (hw2) obj)).invokeSuspend(ju4Var);
                return ju4Var;
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f24010t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f24014x;
        Object obj3 = this.f24013w;
        Object string = this.f24012v;
        switch (b) {
            case 0:
                hw2 hw2Var = (hw2) this.f24011u;
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                C0908mg c0908mg = (C0908mg) obj3;
                xd3 xd3Var = c0908mg.f24870b;
                if (string == null) {
                    hw2Var.m6526d(xd3Var);
                } else {
                    if (!(string instanceof Integer) && !(string instanceof Double) && !(string instanceof String) && !(string instanceof Boolean) && !(string instanceof Float) && !(string instanceof Long) && ((!(string instanceof Set) || !(hb0.m6300L0((Iterable) string) instanceof String)) && !(string instanceof byte[]))) {
                        i92 i92Var = (i92) obj2;
                        jc2 jc2Var = c0908mg.f24869a;
                        i92Var.getClass();
                        hf0 hf0Var = new hf0((byte) 9);
                        r80 r80Var = r80.f29074c;
                        hf0Var.f20529c = r80Var.m3453d(128);
                        try {
                            sc6.m10685z(i92Var, hf0Var, jc2Var, string);
                            string = hf0Var.toString();
                            r80Var.m3451b((char[]) hf0Var.f20529c);
                        } catch (Throwable th) {
                            r80.f29074c.m3451b((char[]) hf0Var.f20529c);
                            throw th;
                        }
                    }
                    hw2Var.m6527e(xd3Var, string);
                }
                return ju4Var;
            case 1:
                List list = (List) this.f24011u;
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                String name = ((Thread) string).getName();
                long j = ((i41) ((wp1) obj3).invoke()).f21121a;
                String strM10712a0 = se0.m10712a0((Throwable) obj2);
                C1112rl c1112rl = new C1112rl();
                c1112rl.f29385a = name;
                c1112rl.f29386b = j;
                c1112rl.f29387c = strM10712a0;
                VarHandle.storeStoreFence();
                return hb0.m6311W0(list, c1112rl);
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                zo0 zo0Var = (zo0) this.f24011u;
                cp0 cp0Var = cp0.f16328d;
                pc3 pc3Var = (pc3) string;
                wm0 wm0Var = null;
                lb5.m7910S(zo0Var, null, cp0Var, new ho0(pc3Var, (yj4) obj3, wm0Var, (byte) 0), 1);
                lb5.m7910S(zo0Var, null, cp0Var, new C0594e0((Object) pc3Var, obj2, wm0Var, (byte) 20), 1);
                return ju4Var;
            default:
                ap0 ap0Var4 = ap0.f14763a;
                k43.m7376J(obj);
                hw2 hw2Var2 = (hw2) this.f24011u;
                xd3 xd3Var2 = (xd3) obj3;
                if (string != null) {
                    hw2Var2.m6527e(xd3Var2, string);
                } else {
                    hw2Var2.m6526d(xd3Var2);
                }
                ((e44) obj2).m4919c(hw2Var2);
                return ju4Var;
        }
    }
}
