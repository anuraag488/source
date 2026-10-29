package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class nj2 {

    /* JADX INFO: renamed from: a */
    public static final x73 f25885a;

    /* JADX INFO: renamed from: b */
    public static final v73 f25886b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f25887c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f25888d;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f25885a = x73.m12526a(new xd2((byte) 10), mj2.class);
        f25886b = v73.m11756a(new xd2((byte) 11), u50VarM13266c);
        f25887c = fd2.m5692a(new xd2((byte) 12), lj2.class);
        f25888d = dd2.m4479a(new xd2((byte) 13), u50VarM13266c);
    }

    /* JADX INFO: renamed from: a */
    public static mj2 m8781a(me2 me2Var, j63 j63Var) throws GeneralSecurityException {
        Object objMo4669a;
        C0641f8 c0641f8;
        C0973o7 c0973o7 = C0973o7.f26400z;
        C0641f8 c0641f9 = C0641f8.f18823x;
        C0641f8 c0641f10 = C0641f8.f18822w;
        C0641f8 c0641f11 = C0641f8.f18821v;
        C0641f8 c0641f12 = C0641f8.f18819t;
        C0641f8 c0641f13 = C0641f8.f18820u;
        C0641f8 c0641f14 = C0641f8.f18818s;
        id2 id2VarM7068B = jd2.m7068B();
        id2VarM7068B.m6763g(me2Var.m8292y().m7076z());
        id2VarM7068B.m6764h(me2Var.m8292y().m7071A());
        id2VarM7068B.m6762f(j63.f22047e);
        try {
            jd2 jd2VarM7069C = jd2.m7069C(((jd2) id2VarM7068B.m9628b()).m11692e(), qc1.m9861a());
            nw2 nw2Var = nw2.f26151b;
            u50 u50VarM13264a = yv4.m13264a(jd2VarM7069C.m7076z());
            nh3 nh3Var = new nh3(jd2VarM7069C, u50VarM13264a);
            r24 r24Var = (r24) nw2Var.f26152a.get();
            r24Var.getClass();
            if (r24Var.f28973d.containsKey(new p24(nh3.class, u50VarM13264a))) {
                r24 r24Var2 = (r24) nw2Var.f26152a.get();
                r24Var2.getClass();
                p24 p24Var = new p24(nh3.class, (u50) nh3Var.f25810b);
                HashMap map = r24Var2.f28973d;
                if (map.containsKey(p24Var)) {
                    objMo4669a = ((v73) map.get(p24Var)).f32447b.mo4669a(nh3Var);
                } else {
                    xy4.m12793v("No Parameters Parser for requested key type ", p24Var, " available");
                    objMo4669a = null;
                }
            } else {
                sj2 sj2Var = new sj2();
                sj2Var.f30330a = nh3Var;
                VarHandle.storeStoreFence();
                objMo4669a = sj2Var;
            }
            if (objMo4669a instanceof C0754i9) {
                c0641f8 = c0641f14;
            } else if (objMo4669a instanceof v70) {
                c0641f8 = c0641f13;
            } else if (objMo4669a instanceof i45) {
                c0641f8 = c0641f12;
            } else if (objMo4669a instanceof C0679g8) {
                c0641f8 = c0641f11;
            } else if (objMo4669a instanceof C1322x8) {
                c0641f8 = c0641f10;
            } else {
                if (!(objMo4669a instanceof C1137s9)) {
                    xd2.m12666m(objMo4669a, "Unsupported DEK parameters when parsing ");
                    return null;
                }
                c0641f8 = c0641f9;
            }
            int iOrdinal = j63Var.ordinal();
            if (iOrdinal == 1) {
                c0973o7 = C0973o7.f26399y;
            } else if (iOrdinal != 3) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + j63Var.m7024b());
            }
            String strM8293z = me2Var.m8293z();
            AbstractC0640f7 abstractC0640f7 = (AbstractC0640f7) objMo4669a;
            if (strM8293z == null) {
                xy4.m12788q("kekUri must be set");
                return null;
            }
            if (abstractC0640f7 == null) {
                xy4.m12788q("dekParametersForNewKeys must be set");
                return null;
            }
            if (abstractC0640f7.mo5593a()) {
                xy4.m12788q("dekParametersForNewKeys must not have ID Requirements");
                return null;
            }
            if ((c0641f8 == c0641f14 && (abstractC0640f7 instanceof C0754i9)) || ((c0641f8 == c0641f13 && (abstractC0640f7 instanceof v70)) || ((c0641f8 == c0641f12 && (abstractC0640f7 instanceof i45)) || ((c0641f8 == c0641f11 && (abstractC0640f7 instanceof C0679g8)) || ((c0641f8 == c0641f10 && (abstractC0640f7 instanceof C1322x8)) || (c0641f8 == c0641f9 && (abstractC0640f7 instanceof C1137s9))))))) {
                mj2 mj2Var = new mj2();
                mj2Var.f24967a = c0973o7;
                mj2Var.f24968b = strM8293z;
                mj2Var.f24969c = c0641f8;
                mj2Var.f24970d = abstractC0640f7;
                VarHandle.storeStoreFence();
                return mj2Var;
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + c0641f8.f18827b + " when new keys are picked according to " + abstractC0640f7 + ".");
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static me2 m8782b(mj2 mj2Var) {
        AbstractC0640f7 abstractC0640f7 = mj2Var.f24970d;
        r24 r24Var = (r24) nw2.f26151b.f26152a.get();
        r24Var.getClass();
        q24 q24Var = new q24(abstractC0640f7.getClass(), nh3.class);
        HashMap map = r24Var.f28972c;
        if (!map.containsKey(q24Var)) {
            xy4.m12793v("No Key Format serializer for ", q24Var, " available");
            return null;
        }
        try {
            jd2 jd2VarM7069C = jd2.m7069C(((jd2) ((x73) map.get(q24Var)).f34043b.mo4674i(abstractC0640f7).f25811c).m11692e(), qc1.m9861a());
            le2 le2VarM8287A = me2.m8287A();
            String str = mj2Var.f24968b;
            le2VarM8287A.m9631e();
            ((me2) le2VarM8287A.f27912b).m8291D(str);
            le2VarM8287A.m9631e();
            ((me2) le2VarM8287A.f27912b).m8290C(jd2VarM7069C);
            return (me2) le2VarM8287A.m9628b();
        } catch (h72 e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static j63 m8783c(C0973o7 c0973o7) throws GeneralSecurityException {
        if (C0973o7.f26399y == c0973o7) {
            return j63.f22045c;
        }
        if (C0973o7.f26400z == c0973o7) {
            return j63.f22047e;
        }
        xd2.m12666m(c0973o7, "Unable to serialize variant: ");
        return null;
    }
}
