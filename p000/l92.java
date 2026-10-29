package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l92 implements vq4 {

    /* JADX INFO: renamed from: c */
    public static final k92 f23874c;

    /* JADX INFO: renamed from: d */
    public static final k92 f23875d;

    /* JADX INFO: renamed from: a */
    public z32 f23876a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f23877b;

    static {
        int i = 0;
        f23874c = new k92(i);
        f23875d = new k92(i);
    }

    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        j92 j92Var = (j92) cs4Var.f16429a.getAnnotation(j92.class);
        if (j92Var == null) {
            return null;
        }
        return m7874b(this.f23876a, ou1Var, cs4Var, j92Var, true);
    }

    /* JADX INFO: renamed from: b */
    public final uq4 m7874b(z32 z32Var, ou1 ou1Var, cs4 cs4Var, j92 j92Var, boolean z) {
        uq4 uq4VarMo3628a;
        Object objMo7823g = z32Var.m13329z(new cs4(j92Var.value()), true).mo7823g();
        boolean zNullSafe = j92Var.nullSafe();
        if (objMo7823g instanceof uq4) {
            uq4VarMo3628a = (uq4) objMo7823g;
        } else if (objMo7823g instanceof vq4) {
            vq4 vq4Var = (vq4) objMo7823g;
            if (z) {
                vq4 vq4Var2 = (vq4) this.f23877b.putIfAbsent(cs4Var.f16429a, vq4Var);
                if (vq4Var2 != null) {
                    vq4Var = vq4Var2;
                }
            }
            uq4VarMo3628a = vq4Var.mo3628a(ou1Var, cs4Var);
        } else {
            boolean z2 = objMo7823g instanceof km2;
            if (!z2) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo7823g.getClass().getName() + " as a @JsonAdapter for " + qs5.m10093R(cs4Var.f16430b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            tp4 tp4Var = new tp4(z2 ? (km2) objMo7823g : null, ou1Var, cs4Var, z ? f23874c : f23875d, zNullSafe);
            zNullSafe = false;
            uq4VarMo3628a = tp4Var;
        }
        return (uq4VarMo3628a == null || !zNullSafe) ? uq4VarMo3628a : uq4VarMo3628a.m11626a();
    }
}
