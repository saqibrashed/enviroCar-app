package org.envirocar.app.services.obd;

import android.app.PendingIntent;

/**
 * TODO JavaDoc
 *
 * @author dewall
 */
class OBDNotificationActionHolder {
    final int actionIcon;
    final int actionString;
    final PendingIntent actionIntent;

    /**
     * Constructor.
     *
     * @param actionIcon    The icon of the action.
     * @param actionString  The title of the action.
     * @param actionIntent The pending intent of the action.
     */
    public OBDNotificationActionHolder(int actionIcon, int actionString, PendingIntent
            actionIntent) {
        this.actionIcon = actionIcon;
        this.actionString = actionString;
        this.actionIntent = actionIntent;
    }
}
