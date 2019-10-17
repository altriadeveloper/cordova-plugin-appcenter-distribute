var Distribute = {
    checkForUpdates: function (success, error) {
        exec(success, error, "AppCenterDistribute", "checkForUpdates", []);
    },
};

module.exports = Distribute;
