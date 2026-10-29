package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: mo */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class C0916mo implements vq4 {
    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        Type type = cs4Var.f16430b;
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        uq4 uq4VarM9271d = ou1Var.m9271d(new cs4(genericComponentType));
        Class clsM10080E = qs5.m10080E(genericComponentType);
        C0953no c0953no = new C0953no();
        c0953no.f25977b = new bq2(ou1Var, uq4VarM9271d, clsM10080E);
        c0953no.f25976a = clsM10080E;
        VarHandle.storeStoreFence();
        return c0953no;
    }
}
