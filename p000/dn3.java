package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dn3 extends ue2 implements wp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f17210i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f17211j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f17212k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn3(Object obj, Object obj2, byte b) {
        super(0);
        this.f17210i = b;
        this.f17211j = obj;
        this.f17212k = obj2;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f17210i;
        Object obj = this.f17212k;
        Object obj2 = this.f17211j;
        switch (b) {
            case 0:
                rn3 rn3Var = ((en3) obj2).f18272a;
                d83 d83Var = rn3Var.f29450k;
                qn3 qn3VarM10375b = rn3Var.m10375b();
                wm0 wm0Var = null;
                o52 o52VarM8954a = qn3VarM10375b != null ? o52.m8954a(qn3VarM10375b.m9991a()) : null;
                qn3 qn3VarM10375b2 = rn3Var.m10375b();
                if ((qn3VarM10375b2 != null ? Integer.valueOf(qn3VarM10375b2.f28622a.f25846a) : null) != null) {
                    rn3Var.f29458s.setValue(d83Var.getValue());
                    lb5.m7910S(rn3Var.f29441b, null, null, new mn3(rn3Var, rn3Var.m10376c(), null), 3);
                }
                rn3Var.f29452m.setValue(b33.m3423a(0L));
                d83Var.setValue(null);
                rn3Var.f29453n.setValue(o52.m8954a(o52VarM8954a != null ? o52VarM8954a.f26352a : 0L));
                py3 py3Var = rn3Var.f29445f;
                lb5.m7910S(py3Var.f28097b, null, null, new ny3(py3Var, wm0Var, (byte) 1), 3);
                rn3Var.f29454o.setValue(null);
                rn3Var.f29455p.setValue(null);
                ((wp1) obj).invoke();
                return ju4.f22634a;
            case 1:
                return Boolean.valueOf(z62.m13387o(obj2, ((rn3) obj).f29450k.getValue()));
            default:
                return Float.valueOf(((Number) ((wp1) ((sw2) obj2).getValue()).invoke()).floatValue() / (((Number) ((sw2) obj).getValue()).floatValue() / 1000.0f));
        }
    }
}
