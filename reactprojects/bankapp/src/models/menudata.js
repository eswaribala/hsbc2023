export const items=[
    {
        label: 'Banking',
        icon: 'pi pi-fw pi-money-bill',
        items: [
            {
                label: 'CreditCards',
                icon: 'pi pi-fw pi-credit-card',
                items: [
                    {
                        label: 'Cashback Card',
                        icon: 'pi pi-fw pi-briefcase',
                        command: () => { window.location.href = "/cashback-card" }
                    },
                    {
                        label: 'Visa Platinum Card',
                        icon: 'pi pi-fw pi-briefcase',
                        command: () => { window.location.href = "/cisa-platinum" }
                    },
                    {
                        label: 'Smart Value Card',
                        icon: 'pi pi-fw pi-briefcase',
                        command: () => { window.location.href = "/cmart-card" }
                    },
                    {
                        label: 'Compare Card',
                        icon: 'pi pi-fw pi-briefcase',
                        command: () => { window.location.href = "/compare-card" }
                    },
                ]
            },
            {
                label: 'CreditCard Features',
                icon: 'pi pi-fw pi-credit-card',
                command: () => { window.location.href = "/card-features" }
            },
            {
                separator: true
            },
            {
                label: 'Bank Accounts',
                icon: 'pi pi-fw pi-external-link',
                items:[
                    {
                        label: 'Savings Account',
                        icon: 'pi pi-fw pi-briefcase',
                        command: () => { window.location.href = "/savings-account" }
                    },

                    {
                        label: 'Fixed Deposit',
                        icon: 'pi pi-fw pi-briefcase',
                        command: () => { window.location.href = "/fixed-deposit" }
                    },
                    {
                        label: 'Debit Card',
                        icon: 'pi pi-fw pi-briefcase',
                        command: () => { window.location.href = "/debit-card" }
                    },
                ]
            }
        ]
    },

    {
        label: 'Borrowing',
        icon: 'pi pi-fw pi-money-bill',
        items:[{

                label: 'Home Loans',
                icon: 'pi pi-fw pi-briefcase',
                items:[{
                    label: 'Loan Against Property',
                    icon: 'pi pi-fw pi-briefcase',
                    command: () => { window.location.href = "/loan-against-property" }
                },
                    {
                        label: 'NRI Home Loan',
                        icon: 'pi pi-fw pi-briefcase',
                        command: () => { window.location.href = "/nri-home-loan" }
                    },

                ]
             },
                {

                    label: 'Personal Loans',
                    icon: 'pi pi-fw pi-briefcase',
                    command: () => { window.location.href = "/personal-loan" }
                }


        ]


    },

    {
        label: 'Investments',
        icon: 'pi pi-fw pi-money-bill',
        items:[{

            label: 'Digital Wealth',
            icon: 'pi pi-fw pi-briefcase',
            items:[{
                label: 'Wealth Management',
                icon: 'pi pi-fw pi-briefcase',
                command: () => { window.location.href = "/wealth-management" }
            },
                {
                    label: 'Wealth Dashboard',
                    icon: 'pi pi-fw pi-briefcase',
                    command: () => { window.location.href = "/wealth-dashboard" }
                },

            ]
        },
            {

                label: 'Insights',
                icon: 'pi pi-fw pi-briefcase',
                command: () => { window.location.href = "/insights" }
            }


        ]


    },
    {
        label: 'NRI',
        icon: 'pi pi-fw pi-money-bill',
        items:[{

            label: 'Forex',
            icon: 'pi pi-fw pi-briefcase',
            items:[{
                label: 'FX Detail',
                icon: 'pi pi-fw pi-briefcase',
                command: () => { window.location.href = "/fx-details" }
            }
            ]
        },
            {

                label: 'Remittances',
                icon: 'pi pi-fw pi-briefcase',
                items:[{
                    label: 'Global Money Transfers',
                    icon: 'pi pi-fw pi-briefcase',
                    command: () => { window.location.href = "/remittances" }
                }]
            }


        ]


    },
    {
        label: 'Offers',
        icon: 'pi pi-fw pi-money-bill',
        items:[{

            label: 'Credit and Debit Card Offers',
            icon: 'pi pi-fw pi-briefcase',
            items:[{
                label: 'Travel',
                icon: 'pi pi-fw pi-briefcase',
                command: () => { window.location.href = "/travel" }
            }
            ]
        },
            {

                label: 'Rewards Programs',
                icon: 'pi pi-fw pi-briefcase',
                items:[{
                    label: 'Global Money Transfers',
                    icon: 'pi pi-fw pi-briefcase',
                    command: () => { window.location.href = "/reward-programs" }
                }]
            }


        ]


    },
    {
        label: 'Online',
        icon: 'pi pi-fw pi-money-bill',
        items:[{

            label: 'Payments',
            icon: 'pi pi-fw pi-briefcase',
            items:[{
                label: 'Travel',
                icon: 'pi pi-fw pi-briefcase',
                command: () => { window.location.href = "/online-travel" }
            }
            ]
        },
            {

                label: 'Mobile Banking',
                icon: 'pi pi-fw pi-briefcase',
                items:[{
                    label: 'Simply Pay',
                    icon: 'pi pi-fw pi-briefcase',
                    command: () => { window.location.href = "/simply-pay" }
                }]
            }


        ]


    }



]
