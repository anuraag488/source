package p000;

import java.lang.invoke.VarHandle;
import java.util.function.Function;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg3 implements Function {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ yg3 f34271a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f34272b;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        yg3 yg3Var = this.f34271a;
        ProfileBoundaryInterface profileBoundaryInterface = (ProfileBoundaryInterface) i20.m6592q(ProfileBoundaryInterface.class, ((ProfileStoreBoundaryInterface) yg3Var.f35215b).getOrCreateProfile(this.f34272b));
        ug3 ug3Var = new ug3();
        ug3Var.f31858a = profileBoundaryInterface;
        VarHandle.storeStoreFence();
        return ug3Var;
    }
}
