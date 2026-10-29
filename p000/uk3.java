package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uk3 extends bp2 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ byte f31951g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f31952h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk3(n96 n96Var) {
        super(20);
        this.f31952h = n96Var;
    }

    @Override // p000.bp2
    /* JADX INFO: renamed from: a */
    public Object mo3646a(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        switch (this.f31951g) {
            case 1:
                String str = (String) obj;
                y42.m12851X(str);
                n96 n96Var = (n96) this.f31952h;
                n96Var.m10368u();
                y42.m12851X(str);
                ar5 ar5Var = n96Var.f19870f.f28593c;
                qm6.m9925S(ar5Var);
                tt2 tt2VarM3163C0 = ar5Var.m3163C0(str);
                if (tt2VarM3163C0 == null) {
                    return null;
                }
                d76 d76Var = ((oa6) n96Var.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16831L.m12505b(str, "Populate EES config from database on cache miss. appId");
                n96Var.m8640C(str, n96Var.m8641D(str, (byte[]) tt2VarM3163C0.f31428b));
                uk3 uk3Var = n96Var.f25587n;
                synchronized (uk3Var.f15480c) {
                    linkedHashMap = new LinkedHashMap(uk3Var.f15479b.f16332a.entrySet().size());
                    for (Map.Entry entry : uk3Var.f15479b.f16332a.entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (pv5) linkedHashMap.get(str);
            default:
                return super.mo3646a(obj);
        }
    }

    @Override // p000.bp2
    /* JADX INFO: renamed from: b */
    public void mo3647b(Object obj, Object obj2, Object obj3) {
        switch (this.f31951g) {
            case 0:
                tk3 tk3Var = (tk3) obj2;
                ((hf0) ((z32) this.f31952h).f35738b).m6384r((gs2) obj, tk3Var.f31211a, tk3Var.f31212b, tk3Var.f31213c);
                break;
        }
    }

    @Override // p000.bp2
    /* JADX INFO: renamed from: g */
    public int mo3652g(Object obj, Object obj2) {
        switch (this.f31951g) {
            case 0:
                return ((tk3) obj2).f31213c;
            default:
                return super.mo3652g(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk3(int i, z32 z32Var) {
        super(i);
        this.f31952h = z32Var;
    }
}
