package p000;

import com.google.android.play.core.hsdp.model.CallerAppContext;
import com.google.android.play.core.hsdp.model.DeepLinkContext;
import com.google.android.play.core.hsdp.model.TargetAppContext;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ka6 extends DeepLinkContext {

    /* JADX INFO: renamed from: a */
    public CallerAppContext f23031a;

    /* JADX INFO: renamed from: b */
    public TargetAppContext f23032b;

    @Override // com.google.android.play.core.hsdp.model.DeepLinkContext
    public final CallerAppContext callerAppContext() {
        return this.f23031a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DeepLinkContext) {
            DeepLinkContext deepLinkContext = (DeepLinkContext) obj;
            CallerAppContext callerAppContext = this.f23031a;
            if (callerAppContext != null ? callerAppContext.equals(deepLinkContext.callerAppContext()) : deepLinkContext.callerAppContext() == null) {
                TargetAppContext targetAppContext = this.f23032b;
                if (targetAppContext != null ? targetAppContext.equals(deepLinkContext.targetAppContext()) : deepLinkContext.targetAppContext() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        CallerAppContext callerAppContext = this.f23031a;
        int iHashCode = callerAppContext == null ? 0 : callerAppContext.hashCode();
        TargetAppContext targetAppContext = this.f23032b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (targetAppContext != null ? targetAppContext.hashCode() : 0);
    }

    @Override // com.google.android.play.core.hsdp.model.DeepLinkContext
    public final TargetAppContext targetAppContext() {
        return this.f23032b;
    }

    public final String toString() {
        TargetAppContext targetAppContext = this.f23032b;
        return "DeepLinkContext{callerAppContext=" + String.valueOf(this.f23031a) + ", targetAppContext=" + String.valueOf(targetAppContext) + '}';
    }
}
