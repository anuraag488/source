package p000;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l90 implements yf3 {

    /* JADX INFO: renamed from: a */
    public static final l90 f23866a = new l90();

    @Override // p000.yf3
    /* JADX INFO: renamed from: a */
    public final Class mo4514a() {
        return k90.class;
    }

    @Override // p000.yf3
    /* JADX INFO: renamed from: b */
    public final Object mo4515b(jp0 jp0Var, ut2 ut2Var, C1163sz c1163sz) throws GeneralSecurityException {
        u50 u50VarM10344k0;
        List list;
        yd2 yd2VarM7217C = jp0Var.m7217C();
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) jp0Var.f22481b).size(); i++) {
            yd2 yd2VarM7247v = jp0Var.m7247v(i);
            if (yd2VarM7247v.f35130c == C0641f8.f18815p) {
                k90 k90Var = (k90) c1163sz.m10955a(yd2VarM7247v);
                se0 se0VarM13097a = yd2VarM7247v.m13097a();
                if (se0VarM13097a instanceof fp2) {
                    u50VarM10344k0 = ((fp2) se0VarM13097a).mo5774k0();
                } else {
                    if (!(se0VarM13097a instanceof rj2)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + se0VarM13097a.getClass().getName() + " with parameters " + se0VarM13097a.mo3664B());
                    }
                    u50VarM10344k0 = ((rj2) se0VarM13097a).m10344k0();
                }
                byte[] bArr = u50VarM10344k0.f31654a;
                if (bArr.length != 0 && bArr.length != 5) {
                    xy4.m12788q("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (map.containsKey(u50VarM10344k0)) {
                    list = (List) map.get(u50VarM10344k0);
                } else {
                    ArrayList arrayList = new ArrayList();
                    map.put(u50VarM10344k0, arrayList);
                    list = arrayList;
                }
                list.add(k90Var);
            }
        }
        return new k90();
    }

    @Override // p000.yf3
    /* JADX INFO: renamed from: c */
    public final Class mo4516c() {
        return k90.class;
    }
}
