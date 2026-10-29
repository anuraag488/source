package p000;

import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xl6 implements k76 {

    /* JADX INFO: renamed from: a */
    public String f34400a;

    /* JADX INFO: renamed from: b */
    public Object f34401b;

    /* JADX INFO: renamed from: c */
    public Object f34402c;

    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0017, B:19:0x0063, B:22:0x0087, B:13:0x0028, B:15:0x0050, B:17:0x005b, B:18:0x005f), top: B:27:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0050 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0017, B:19:0x0063, B:22:0x0087, B:13:0x0028, B:15:0x0050, B:17:0x005b, B:18:0x005f), top: B:27:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0017, B:19:0x0063, B:22:0x0087, B:13:0x0028, B:15:0x0050, B:17:0x005b, B:18:0x005f), top: B:27:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0017, B:19:0x0063, B:22:0x0087, B:13:0x0028, B:15:0x0050, B:17:0x005b, B:18:0x005f), top: B:27:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[Catch: all -> 0x001a, PHI: r5
  0x0063: PHI (r5v3 int) = (r5v1 int), (r5v0 int) binds: [B:12:0x0026, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0017, B:19:0x0063, B:22:0x0087, B:13:0x0028, B:15:0x0050, B:17:0x005b, B:18:0x005f), top: B:27:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0086  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.k76
    /* JADX INFO: renamed from: e */
    public void mo7423e(String str, int i, Throwable th, byte[] bArr, Map map) {
        q76 q76Var;
        ar5 ar5Var;
        String strSubstring;
        Object obj;
        um6 um6Var = (um6) this.f34401b;
        qm6 qm6Var = (qm6) this.f34402c;
        String str2 = this.f34400a;
        qm6Var.mo9020c().mo5038t();
        qm6Var.m9962k0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                qm6Var.f28611u = false;
                qm6Var.m9937M();
            }
        }
        if (i == 200) {
            if (th == null) {
                ar5 ar5Var2 = qm6Var.f28593c;
                qm6.m9925S(ar5Var2);
                ar5Var2.m3160B(Long.valueOf(um6Var.f31998a));
                qm6Var.mo9019b().f16831L.m12506c("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i));
                q76Var = qm6Var.f28592b;
                qm6.m9925S(q76Var);
                if (q76Var.m9785O()) {
                    ar5Var = qm6Var.f28593c;
                    qm6.m9925S(ar5Var);
                    if (ar5Var.m3158A(str2)) {
                        qm6Var.m9976t(str2);
                    } else {
                        qm6Var.m9936L();
                    }
                } else {
                    qm6Var.m9936L();
                }
            } else {
                String str3 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str3.substring(0, Math.min(32, str3.length()));
                x66 x66Var = qm6Var.mo9019b().f16840o;
                Integer numValueOf = Integer.valueOf(i);
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                x66Var.m12507d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                ar5 ar5Var3 = qm6Var.f28593c;
                qm6.m9925S(ar5Var3);
                ar5Var3.m3168G(Long.valueOf(um6Var.f31998a));
                qm6Var.m9936L();
            }
        } else if (i == 204) {
            i = 204;
            if (th == null) {
                ar5 ar5Var4 = qm6Var.f28593c;
                qm6.m9925S(ar5Var4);
                ar5Var4.m3160B(Long.valueOf(um6Var.f31998a));
                qm6Var.mo9019b().f16831L.m12506c("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i));
                q76Var = qm6Var.f28592b;
                qm6.m9925S(q76Var);
                if (q76Var.m9785O()) {
                    ar5Var = qm6Var.f28593c;
                    qm6.m9925S(ar5Var);
                    if (ar5Var.m3158A(str2)) {
                        qm6Var.m9976t(str2);
                    } else {
                        qm6Var.m9936L();
                    }
                } else {
                    qm6Var.m9936L();
                }
            } else {
                String str4 = new String(bArr, StandardCharsets.UTF_8);
                strSubstring = str4.substring(0, Math.min(32, str4.length()));
                x66 x66Var2 = qm6Var.mo9019b().f16840o;
                Integer numValueOf2 = Integer.valueOf(i);
                obj = th;
                if (th == null) {
                    obj = strSubstring;
                }
                x66Var2.m12507d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                ar5 ar5Var5 = qm6Var.f28593c;
                qm6.m9925S(ar5Var5);
                ar5Var5.m3168G(Long.valueOf(um6Var.f31998a));
                qm6Var.m9936L();
            }
        } else {
            String str5 = new String(bArr, StandardCharsets.UTF_8);
            strSubstring = str5.substring(0, Math.min(32, str5.length()));
            x66 x66Var3 = qm6Var.mo9019b().f16840o;
            Integer numValueOf3 = Integer.valueOf(i);
            obj = th;
            if (th == null) {
                obj = strSubstring;
            }
            x66Var3.m12507d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
            ar5 ar5Var6 = qm6Var.f28593c;
            qm6.m9925S(ar5Var6);
            ar5Var6.m3168G(Long.valueOf(um6Var.f31998a));
            qm6Var.m9936L();
        }
    }
}
