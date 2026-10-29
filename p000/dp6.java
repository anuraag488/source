package p000;

import com.google.android.play.core.hsdp.model.BottomSheetDisplayConfig;
import com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig;
import com.google.android.play.core.hsdp.model.InlineInstallsDisplayConfig;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dp6 extends InlineInstallsDisplayConfig {

    /* JADX INFO: renamed from: a */
    public BottomSheetDisplayConfig f17273a;

    /* JADX INFO: renamed from: b */
    public EngagementPanelDisplayConfig f17274b;

    @Override // com.google.android.play.core.hsdp.model.InlineInstallsDisplayConfig
    public final BottomSheetDisplayConfig bottomSheet() {
        return this.f17273a;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallsDisplayConfig
    public final EngagementPanelDisplayConfig engagementPanel() {
        return this.f17274b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InlineInstallsDisplayConfig) {
            InlineInstallsDisplayConfig inlineInstallsDisplayConfig = (InlineInstallsDisplayConfig) obj;
            BottomSheetDisplayConfig bottomSheetDisplayConfig = this.f17273a;
            if (bottomSheetDisplayConfig != null ? bottomSheetDisplayConfig.equals(inlineInstallsDisplayConfig.bottomSheet()) : inlineInstallsDisplayConfig.bottomSheet() == null) {
                EngagementPanelDisplayConfig engagementPanelDisplayConfig = this.f17274b;
                if (engagementPanelDisplayConfig != null ? engagementPanelDisplayConfig.equals(inlineInstallsDisplayConfig.engagementPanel()) : inlineInstallsDisplayConfig.engagementPanel() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        BottomSheetDisplayConfig bottomSheetDisplayConfig = this.f17273a;
        int iHashCode = bottomSheetDisplayConfig == null ? 0 : bottomSheetDisplayConfig.hashCode();
        EngagementPanelDisplayConfig engagementPanelDisplayConfig = this.f17274b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (engagementPanelDisplayConfig != null ? engagementPanelDisplayConfig.hashCode() : 0);
    }

    public final String toString() {
        EngagementPanelDisplayConfig engagementPanelDisplayConfig = this.f17274b;
        return "InlineInstallsDisplayConfig{bottomSheet=" + String.valueOf(this.f17273a) + ", engagementPanel=" + String.valueOf(engagementPanelDisplayConfig) + '}';
    }
}
