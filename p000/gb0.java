package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gb0 implements vq4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19700a;

    /* JADX INFO: renamed from: b */
    public z32 f19701b;

    public /* synthetic */ gb0(byte b) {
        this.f19700a = b;
    }

    @Override // p000.vq4
    /* JADX INFO: renamed from: a */
    public final uq4 mo3628a(ou1 ou1Var, cs4 cs4Var) {
        Type[] actualTypeArguments;
        Type type = Object.class;
        switch (this.f19700a) {
            case 0:
                Type type2 = cs4Var.f16430b;
                Class cls = cs4Var.f16429a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type typeM10082G = qs5.m10082G(type2, cls, Collection.class);
                type = typeM10082G instanceof ParameterizedType ? ((ParameterizedType) typeM10082G).getActualTypeArguments()[0] : Object.class;
                bq2 bq2Var = new bq2(ou1Var, ou1Var.m9271d(new cs4(type)), type);
                l23 l23VarM13329z = this.f19701b.m13329z(cs4Var, false);
                fb0 fb0Var = new fb0((byte) 0);
                fb0Var.f18888b = bq2Var;
                fb0Var.f18889c = l23VarM13329z;
                VarHandle.storeStoreFence();
                return fb0Var;
            default:
                Type type3 = cs4Var.f16430b;
                Class cls2 = cs4Var.f16429a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type typeM10082G2 = qs5.m10082G(type3, cls2, Map.class);
                    actualTypeArguments = typeM10082G2 instanceof ParameterizedType ? ((ParameterizedType) typeM10082G2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                Type type5 = actualTypeArguments[1];
                bq2 bq2Var2 = new bq2(ou1Var, (type4 == Boolean.TYPE || type4 == Boolean.class) ? zr4.f36296c : ou1Var.m9271d(new cs4(type4)), type4);
                bq2 bq2Var3 = new bq2(ou1Var, ou1Var.m9271d(new cs4(type5)), type5);
                l23 l23VarM13329z2 = this.f19701b.m13329z(cs4Var, false);
                bq2 bq2Var4 = new bq2();
                bq2Var4.f15504b = bq2Var2;
                bq2Var4.f15505c = bq2Var3;
                bq2Var4.f15506d = l23VarM13329z2;
                VarHandle.storeStoreFence();
                return bq2Var4;
        }
    }
}
