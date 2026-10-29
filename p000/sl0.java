package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl0 implements l23 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30364a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Type f30365b;

    public /* synthetic */ sl0(byte b) {
        this.f30364a = b;
    }

    @Override // p000.l23
    /* JADX INFO: renamed from: g */
    public final Object mo7823g() {
        byte b = this.f30364a;
        Type type = this.f30365b;
        switch (b) {
            case 0:
                if (!(type instanceof ParameterizedType)) {
                    C1077qn.m9986l(type, "Invalid EnumSet type: ");
                    return null;
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                C1077qn.m9986l(type, "Invalid EnumSet type: ");
                return null;
            default:
                if (!(type instanceof ParameterizedType)) {
                    C1077qn.m9986l(type, "Invalid EnumMap type: ");
                    return null;
                }
                Type type3 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type3 instanceof Class) {
                    return new EnumMap((Class) type3);
                }
                C1077qn.m9986l(type, "Invalid EnumMap type: ");
                return null;
        }
    }
}
