package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a40 extends xq1 implements nq1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f90b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a40(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f90b = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, InvocationTargetException {
        byte b = this.f90b;
        ju4 ju4Var = ju4.f22634a;
        Object obj4 = this.receiver;
        switch (b) {
            case 0:
                y42.m12846R(((f40) obj4).f18740b, obj2, (ro0) obj3);
                break;
            default:
                Object obj5 = ((o80) obj2).f26421a;
                y42.m12846R(((f40) obj4).f18740b, o80.m8979b(obj5), (ro0) obj3);
                break;
        }
        return ju4Var;
    }
}
